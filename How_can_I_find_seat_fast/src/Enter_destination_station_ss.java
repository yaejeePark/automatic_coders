import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Enter_destination_station_ss /*extends �� �� Ȯ�����ִ� class�Է��� ��!*/ {

	private JPanel contentPane;
	JFrame Enter_destination_station_ss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro_enter_current_place2 frame = new Intro_enter_current_place2();
					frame.Enter_destination_station_ss.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Enter_destination_station_ss() {
		
		Enter_destination_station_ss = new JFrame();//
		Enter_destination_station_ss.getContentPane().setLayout(null);
		Enter_destination_station_ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Enter_destination_station_ss.setBounds(100, 100, 812, 505);
		
		Enter_destination_station_ss.setSize(812,505);
		contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		setBounds(100, 100, 812, 505);//
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);//�̰� 3�� �� extend ������ �������� ��!
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 0, 789, 450);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\enter_destination_ss.PNG"));
		//contentPane.add(btnNewButton);
		Enter_destination_station_ss.getContentPane().add(btnNewButton);
		
		this.Enter_destination_station_ss.setVisible(true);
	}
}
