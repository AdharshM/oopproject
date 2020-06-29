/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppin;

/**
 *
 * @author ADHARSH M NAIR
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

public class Dashboard extends JFrame implements ActionListener{
    JLabel l1, l2, l3, l4;
 JTextField userf;
 JButton catalogue, search, logout;
 JPasswordField pswf;
 Dashboard() {
  JFrame frame = new JFrame(" DashBoard ");
  l1 = new JLabel("DashBoard");
  l1.setForeground(Color.blue);
  l1.setFont(new Font("Arial", Font.BOLD, 28));

  
  
  catalogue = new JButton("Login");

  search=new JButton("Search");
  logout = new JButton("Logout");
  l1.setBounds(300, 30, 400, 30);
  catalogue.setBounds(330, 160, 100, 30);
  search.setBounds(330, 260, 100, 30);
  logout.setBounds(330, 360, 100, 30);
  
  frame.add(l1);
  frame.add(catalogue);
  frame.add(search);
  frame.add(logout);

  frame.setSize(800, 800);
  frame.setLayout(null);
  frame.setBackground(Color.yellow);
  frame.setVisible(true);
  
  logout.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
            frame.setVisible(false);
            dispose();
            new Homepage();
        }  
    });  
 }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args){
            new Dashboard();
    }
}
