/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppin;

/**
 *
 * @author  HOMIE
	// change package names and other editable stuffs, :) 
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener{
 JLabel l1, l2, l3, l4;
 JTextField userf;
 JButton btn1, btn2;
 JPasswordField pswf;
 Login() {
  JFrame frame = new JFrame(" Login ");
  l1 = new JLabel("Login Form");
  l1.setForeground(Color.blue);
  l1.setFont(new Font("Arial", Font.BOLD, 28));

  l2 = new JLabel("Username : ");
  l3 = new JLabel("Password : ");
  userf = new JTextField();
  pswf = new JPasswordField();
  btn1 = new JButton("Login");
  l4= new JLabel("New User?");
  btn2=new JButton("Sign Up");
  l1.setBounds(300, 30, 400, 30);
  l2.setBounds(80, 70, 200, 30);
  l3.setBounds(80, 110, 200, 30);
  l4.setBounds(370, 220, 200, 30);
  userf.setBounds(300, 70, 200, 30);
  pswf.setBounds(300, 110, 200, 30);
  btn1.setBounds(350, 160, 100, 30);
  btn2.setBounds(350, 260, 100, 30);
  
  btn1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent Ae){
    try
{
 // create a mysql database connection
 String myDriver = "org.gjt.mm.mysql.Driver";
 String myUrl = "jdbc:mysql://localhost/shopping";
 Class.forName(myDriver);
 Connection conn = DriverManager.getConnection(myUrl, "root", "");

      // create a sql date object so we can use it in our INSERT statement
  
      String chkquery=" SELECT * FROM users WHERE Username=? AND Password=?";
      PreparedStatement chkstate= conn.prepareStatement(chkquery);
      chkstate.setString(1,userf.getText());
      chkstate.setString(2, new String(pswf.getPassword()));
      ResultSet rs=chkstate.executeQuery();
      if(!rs.next()){
            new Autherror();
            conn.close();
            frame.setVisible(false);
            dispose();
            new Login();
        }
      else{
          frame.setVisible(false);
          dispose();
          new Dashboard();
      }
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
      }
  });
  
  btn2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
            frame.setVisible(false);
            dispose();
            new Signup();
        }  
    });  
  
  frame.add(l1);
  frame.add(l2);
  frame.add(userf);
  frame.add(l3);
  frame.add(pswf);
  frame.add(btn1);
  frame.add(l4);
  frame.add(btn2);

  frame.setSize(800, 800);
  frame.setLayout(null);
  frame.setBackground(Color.yellow);
  frame.setVisible(true);

 }

 public static void main(String[] args) {
  new Login();
 }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}