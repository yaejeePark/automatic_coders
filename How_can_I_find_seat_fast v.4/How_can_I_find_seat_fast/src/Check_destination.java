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
import java.awt.Font;
public class Check_destination extends TCP_echo_server_thread {

   private JPanel contentPane;
   private JFrame Jframe;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               System.out.println("hi!!");

               Check_destination frame = new Check_destination();
               frame.Jframe.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    *  GetCurrentTimeExam currentTime = new GetCurrentTimeExam();//Time 받는 부분
               String currentTimeStr = currentTime.GetCurrentTimeExam();
               outToServer.println("current time is "+currentTimeStr);//여기까지는 잘 돼 !!! 

              System.out.println("Current Time : "+currentTimeStr);
               outToServer.println("current time is "+currentTimeStr);
    */
   public Check_destination() {
      Jframe = new JFrame();
      Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Jframe.setBounds(100, 100, 812, 505);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      Jframe.setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnNewButton = new JButton(" ");
      btnNewButton.setIcon(new ImageIcon("checkDestination.PNG"));
      System.out.println("hi!!");

      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //여기에 넣어 예지얌
            //setVisible(false);
            Intro_inform intro_inform = new Intro_inform();
         }
      });
      btnNewButton.setBounds(0, 0, 789, 450);
      
      contentPane.add(btnNewButton);
      Get_current_time_exam currentTime = new Get_current_time_exam();//Time 받는 부분
        String currentTimeStr = currentTime.GetCurrentTimeExam();
        //여기서 만들어! 
      JLabel lblNewLabel = new JLabel(currentTimeStr);
      lblNewLabel.setFont(new Font("Rix비타민 M", Font.PLAIN, 11));
      lblNewLabel.setBounds(154, 57, 136, 36);
      contentPane.add(lblNewLabel);
      Jframe.setVisible(true);

   }
}

