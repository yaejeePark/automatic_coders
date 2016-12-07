import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
public class Intro_loading extends TCP_echo_server_thread {

   private JPanel contentPane;
   JFrame Jframe;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               System.out.println("hi!!");

               Intro_loading frame = new Intro_loading();
               frame.Jframe.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public Intro_loading() {
      JFrame a = new JFrame();
      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      a.setBounds(560,260,805,505);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      a.setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnNewButton = new JButton("");
      btnNewButton.setIcon(new ImageIcon("loading.png"));
      System.out.println("hi!!");
      
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //여기에 넣어 예지얌
        	a.setVisible(false);
            Intro_inform intro_inform = new Intro_inform();
         }
      });
      btnNewButton.setBounds(0, 0, 789, 450);
      
      
      contentPane.add(btnNewButton);
      a.setVisible(true);
     // subwaydoor _ = new subwaydoor();
   }

}