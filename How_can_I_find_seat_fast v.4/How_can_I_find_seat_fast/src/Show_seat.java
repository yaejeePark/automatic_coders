import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//글씨체 넣기 
//각각 다 확인해보기
public class Show_seat extends JFrame {
	public Show_seat() {
	}
static int finish;
   private JPanel contentPane;

   /**
    * Launch the application.
    */
 /*
  *   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Show_seat frame = new Show_seat();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
*/
   /**
    * Create the frame.
    */
	public void show_seat(ArrayList<Integer> seat) {

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 789, 450);
         getContentPane().setLayout(null);
         int seat1 = seat.get(1);
         ConvertToString ToString= new ConvertToString();
         String str1 = ToString.toString(seat1);
         JLabel lblStation = new JLabel(str1);
         lblStation.setBounds(92, 105, 118, 57);
         getContentPane().add(lblStation);
         
         seat1 = seat.get(2);
         str1 = ToString.toString(seat1);
         JLabel lblStation_1 = new JLabel(str1);
         lblStation_1.setBounds(239, 105, 141, 57);
         getContentPane().add(lblStation_1);
         
         seat1 = seat.get(3);
         str1 = ToString.toString(seat1);
         JLabel lblNewLabel_1 = new JLabel(str1);
         lblNewLabel_1.setBounds(409, 105, 141, 57);
         getContentPane().add(lblNewLabel_1);
         
         seat1 = seat.get(4);
         str1 = ToString.toString(seat1);
         JLabel lblStation_2 = new JLabel(str1);
         lblStation_2.setBounds(574, 105, 118, 57);
         getContentPane().add(lblStation_2);
         
         seat1 = seat.get(5);
         str1 = ToString.toString(seat1);
         JLabel lblNewLabel_2 = new JLabel(str1);
         lblNewLabel_2.setBounds(574, 328, 118, 57);
         getContentPane().add(lblNewLabel_2);
         
         seat1 = seat.get(6);
         str1 = ToString.toString(seat1);
         JLabel lblStatino = new JLabel(str1);
         lblStatino.setBounds(402, 328, 148, 57);
         getContentPane().add(lblStatino);
         
         seat1 = seat.get(7);
         str1 = ToString.toString(seat1);
         JLabel lblStation_3 = new JLabel(str1);
         lblStation_3.setBounds(239, 328, 141, 62);
         getContentPane().add(lblStation_3);
         
         seat1 = seat.get(8);
         str1 = ToString.toString(seat1);
         JLabel lblStation_4 = new JLabel(str1);
         lblStation_4.setBounds(92, 331, 124, 57);
         getContentPane().add(lblStation_4);
         
         JButton JButton_back = new JButton("");
         JButton_back.setLayout(null);
         JButton_back.setBounds(0, 0, 789,450);
         JButton_back.setIcon(new ImageIcon("seat.png"));
         getContentPane().add(JButton_back);
         JButton_back.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             setVisible(false);
	           re(1);
	          }
	       });
         
         setVisible(true);
      }
      private class SwingAction extends AbstractAction {
         public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
         }
         public void actionPerformed(ActionEvent e) {
         }
      }
      private class SwingAction_1 extends AbstractAction {
         public SwingAction_1() {
            putValue(NAME, "SwingAction_1");
            putValue(SHORT_DESCRIPTION, "Some short description");
         }
         public void actionPerformed(ActionEvent e) {
         }
      }
      public void re(int hi)
      {
         finish=hi;
      }
      public int getDesination(){
            System.out.println(finish+"끝났나?");

          return finish;
       }
   }