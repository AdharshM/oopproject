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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Autherror extends JFrame implements ActionListener{
    JFrame frame;
    JLabel L1;
    Autherror(){
        JFrame frame = new JFrame("Login Failed");
        L1 = new JLabel("No such user");
        L1.setBounds(300, 30, 400, 30);
        frame.add(L1);
        frame.setSize(250,250);
        frame.setVisible(true);
    }
            /*@Override*/
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
