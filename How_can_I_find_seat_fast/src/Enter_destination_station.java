import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Enter_destination_station {

	private JPanel contentPane;
	JFrame Enter_destination_station;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro_enter_current_place2 frame = new Intro_enter_current_place2();
					frame.setVisible(true);

					//저거 입력안해서 오류나는건가? frame.Enter_destination_station_ss.setVisible(true);
				} catch (Exception e) 
					e.printStackTrace();
				}
			}
		});
	}

//
	/**
	 * Create the frame.
	 */
	public Enter_destination_station() {
		
		Enter_destination_station = new JFrame();//
		Enter_destination_station.getContentPane().setLayout(null);
		Enter_destination_station.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Enter_destination_station.setBounds(100, 100, 812, 505);
		
		Enter_destination_station.setSize(812,505);
		contentPane = new JPanel();
		Enter_destination_station.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		Enter_destination_station.setBounds(100, 100, 812, 505);//
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Enter_destination_station.setContentPane(contentPane);//이거 3개 저 extend 때문에 오류나는 듯!
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 0, 789, 450);
		btnNewButton.setIcon(new ImageIcon("checkDestination.PNG"));
		//contentPane.add(btnNewButton);
		Enter_destination_station.getContentPane().add(btnNewButton);
		
		this.Enter_destination_station.setVisible(true);
	}
}

