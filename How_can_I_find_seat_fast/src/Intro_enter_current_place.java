import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro_enter_current_place extends Intro_inform {

	private JPanel contentPane;
	JFrame Intro_enter_current_place;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro_enter_current_place frame = new Intro_enter_current_place();
					frame.Intro_enter_current_place.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Intro_enter_current_place() {
		
		Intro_enter_current_place = new JFrame();//
		Intro_enter_current_place.getContentPane().setLayout(null);
		Intro_enter_current_place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Intro_enter_current_place.setBounds(100, 100, 812, 505);
		
		Intro_enter_current_place.setSize(812,505);
		contentPane = new JPanel();
		Intro_enter_current_place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//저거 앞에 intro 없었어!!! 
		Intro_enter_current_place.setBounds(100, 100, 812, 505);//얘도
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Intro_enter_current_place.setContentPane(contentPane);//얘도!
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 0, 789, 450);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\enter_current_station_stop.PNG"));
		//contentPane.add(btnNewButton);
		Intro_enter_current_place.getContentPane().add(btnNewButton);
		
		this.Intro_enter_current_place.setVisible(true);
	}
}
