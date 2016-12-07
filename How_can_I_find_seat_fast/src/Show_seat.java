import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Show_seat extends TCPEchoClient {

	private JPanel contentPane;
	private JFrame Jframe;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("hi!!");

					Show_seat frame = new Show_seat();
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
	public Show_seat() {
		Jframe = new JFrame();
		Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jframe.setBounds(100, 100, 812, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Jframe.setContentPane(contentPane);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.setBounds(0, 0, 789, 450);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\seat.PNG"));
		System.out.println("hi!!");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//여기에 넣어 예지얌
				//setVisible(false);
				Intro_inform intro_inform = new Intro_inform();
			}
		});
		contentPane.setLayout(null);
		
		Check_destination check_destination = new Check_destination();
		
		Current_seat current_seat = new Current_seat();
		current_seat.Queue(person.getCurrentStation(), person.getCurrentStation(), person.getDesttation(), true);
		
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(73, 99, 119, 65);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("New label");
		label.setBounds(237, 99, 119, 65);
		contentPane.add(label);
		
		label_1 = new JLabel("New label");
		label_1.setBounds(411, 99, 119, 65);
		contentPane.add(label_1);
		
		label_2 = new JLabel("New label");
		label_2.setBounds(564, 99, 119, 65);
		contentPane.add(label_2);
		
		label_3 = new JLabel("New label");
		label_3.setBounds(73, 331, 119, 65);
		contentPane.add(label_3);
		
		label_4 = new JLabel("New label");
		label_4.setBounds(237, 331, 119, 65);
		contentPane.add(label_4);
		
		label_5 = new JLabel("New label");
		label_5.setBounds(411, 331, 119, 65);
		contentPane.add(label_5);
		
		label_6 = new JLabel("New label");
		label_6.setBounds(564, 331, 119, 65);
		contentPane.add(label_6);
		Jframe.setVisible(true);

	}

}
