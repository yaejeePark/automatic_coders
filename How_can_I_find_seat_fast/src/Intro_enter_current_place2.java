import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
public class Intro_enter_current_place2 extends Intro_inform {

	protected static final String Enter_destination_station_ss = null;
	private JPanel contentPane;
	JFrame Intro_enter_current_place2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro_enter_current_place2 frame = new Intro_enter_current_place2();
					frame.Intro_enter_current_place2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Intro_enter_current_place2() {
		
		Intro_enter_current_place2 = new JFrame();//
		Intro_enter_current_place2.getContentPane().setLayout(null);
		Intro_enter_current_place2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Intro_enter_current_place2.setBounds(100, 100, 812, 505);
		
		Intro_enter_current_place2.setSize(812,505);
		contentPane = new JPanel();
		Intro_enter_current_place2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//원래 intro없었음
		Intro_enter_current_place2.setBounds(100, 100, 812, 505);//
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Intro_enter_current_place2.setContentPane(contentPane);//
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 0, 789, 450);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\enter_current_station_stop2.PNG"));
		//contentPane.add(btnNewButton);
		Intro_enter_current_place2.getContentPane().add(btnNewButton);
		
		this.Intro_enter_current_place2.setVisible(true);
	}


}
