import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Finish_arrive extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Finish_arrive frame = new Finish_arrive();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
    public Finish_arrive() {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 789, 450);
         getContentPane().setLayout(null);
         
         JLabel lblStation = new JLabel("station");
         lblStation.setBounds(259, 149, 220, 109);
         getContentPane().add(lblStation);
         
       
         
         JLabel lblNewLabel = new JLabel("");
         lblNewLabel.setBounds(0, 0, 789,450);
         lblNewLabel.setIcon(new ImageIcon("arrive.png"));
         getContentPane().add(lblNewLabel);
         System.out.println("hi");
      }
      private class SwingAction extends AbstractAction {
         public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
         }
         public void actionPerformed(ActionEvent e) {
         }
      }
      
   }