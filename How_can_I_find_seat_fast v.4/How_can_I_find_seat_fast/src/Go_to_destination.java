import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
//원래 이름 _ ㅋㅋㅋㅋㅋ
public class Go_to_destination extends JFrame{
	public int go_to_destination(int dest){
      int i = 1;
      int stop = -1;
      int next_station = 0;
      JFrame Jframe = new JFrame();
      Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Jframe.setBounds(100, 100, 812, 505);
      JPanel contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      Jframe.setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnNewButton = new JButton(" ");
      btnNewButton.setBounds(0, 0, 789, 450);
      contentPane.add(btnNewButton);
      Jframe.setVisible(true);
      
	  Subway_stop_or_not Subway_stop_or_not = new Subway_stop_or_not();

   while(i < dest){
	   stop = Subway_stop_or_not.stop_or_not();
      if(stop==1)//멈췄다면
      {
         //해당하는 역의 이미지 보여줘 
         if(i==1){
            location station = new location(); 
            next_station = station.find_current_station(1);//다음은!?
            //이거 보여줘 
            btnNewButton.setIcon(new ImageIcon("station"+(next_station++)+".PNG"));
            i++;
         }
         else{//1보다 더 크면
               btnNewButton.setIcon(new ImageIcon("station"+(next_station++)+".PNG"));
               i++;
         }
      }
      else//가는 중이라면
      {
    	  subwaydoor door = new subwaydoor();
      }
   
   }
   return -1;
   }
}