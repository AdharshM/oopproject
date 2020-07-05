/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppin;

/**
 *
 * @author ADHARSH M NAIR (12327979)
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Homepage extends JFrame implements ActionListener{
    JLabel l1, deals, products, discprice, actprice, productid, dsh1, dsh2, dsh3, dsh4, prod1, prod2, prod3, disc1, disc2, disc3, act1, act2, act3, proid1, proid2, proid3;
    JButton login, signup;
    JPasswordField p1;
    Homepage(){ 
        JFrame frame = new JFrame(" Welcome To eShop ");
    l1 = new JLabel("Welcome To eShop");
    l1.setForeground(Color.blue);
    l1.setFont(new Font("Arial", Font.BOLD, 28));

    deals = new JLabel("Today's Deals & Offers");
    products = new JLabel("Products");
    discprice =new JLabel("Disc. Price");
    actprice =new JLabel("Actual Price");
    productid = new JLabel("Product Id");
    deals.setForeground(Color.blue);
    deals.setFont(new Font("Arial", Font.BOLD, 28));
    login = new JButton("Login");
    signup = new JButton("Sign Up");
    dsh1 = new JLabel("-------------");
    dsh2 = new JLabel("---------------");
    dsh3 = new JLabel("-----------------");
    dsh4 = new JLabel("--------------");
    prod1 = new JLabel("Sunflower Oil(1 ltr)"); disc1 = new JLabel("70.00"); act1 = new JLabel("100.00"); proid1 = new JLabel("121");
    prod2 = new JLabel("Salt(1 kg)"); disc2 = new JLabel("50.00"); act2 = new JLabel("60.00"); proid2 = new JLabel("169");
    prod3 = new JLabel("Soap(Washing)"); disc3 = new JLabel("70.00"); act3 = new JLabel("100.00"); proid3 = new JLabel("137");
    
    
    
    l1.setBounds(230,60,400,30);
    deals.setBounds(210,220,400,30);
    products.setBounds(100,280,400,30);
    discprice.setBounds(250,280,400,30);
    actprice.setBounds(400,280,400,30);
    productid.setBounds(550, 280, 400, 30 );
    dsh1.setBounds(100,290,400,30 );
    dsh2.setBounds(250,290,400,30);
    dsh3.setBounds(400,290,400,30);
    dsh4.setBounds(550,290,400,30);
    
    prod1.setBounds(100,320,400,30); disc1.setBounds(250,320,400,30);  act1.setBounds(400,320,400,30);  proid1.setBounds(550,320,400,30);
    prod2.setBounds(100,360,400,30); disc2.setBounds(250,360,400,30);  act2.setBounds(400,360,400,30);  proid2.setBounds(550,360,400,30);
    prod3.setBounds(100,400,400,30); disc3.setBounds(250,400,400,30);  act3.setBounds(400,400,400,30);  proid3.setBounds(550,400,400,30);
    
    login.setBounds(210, 120, 100, 30);
    signup.setBounds(410, 120, 100, 30);
    
  
    login.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
            frame.setVisible(false);
            dispose();
            new Login();
        }  
    });
  
  signup.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
            frame.setVisible(false);
            dispose();
            new Signup();
        }  
    });  
  
    frame.add(l1);
    frame.add(deals);
    frame.add(products);
    frame.add(discprice);
    frame.add(actprice);
    frame.add(productid);
    frame.add(dsh1);
    frame.add(dsh2);
    frame.add(dsh3);
    frame.add(dsh4);    
    frame.add(prod1); frame.add(disc1); frame.add(act1); frame.add(proid1);
    frame.add(prod2); frame.add(disc2); frame.add(act2); frame.add(proid2);
    frame.add(prod3); frame.add(disc3); frame.add(act3); frame.add(proid3);
    
    frame.add(login);
    frame.add(signup);

    frame.setSize(800, 800);
    frame.setLayout(null);
    frame.setBackground(Color.yellow);
    frame.setVisible(true);

    }
    public static void main(String[] args){
            new Homepage();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
