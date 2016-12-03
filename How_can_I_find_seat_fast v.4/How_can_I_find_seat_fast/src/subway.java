
import java.awt.Color;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class subway extends JFrame{
   JLabel pic;
   Timer tm;
  // JFrame jFrame;
   int x=0;
   String[] list= {
         "subway1.png",
         "subway2.png",
         "subway3.png",
         "subway4.png",
         "subway5.png",
         "subway6.png",
         "subway7.png",
         "subway8.png",
         "subway9.png",
         "subway10.png"
        
   };
   public subway(){
	  super("Java slideshow");
      pic = new JLabel();
      pic.setBounds(0, 0, 789, 450);
      
      SetImageSize(9);
     
      tm= new Timer(1,new ActionListener(){
         
         @Override
         public void actionPerformed(ActionEvent e){
            SetImageSize(x);
            x+=1;
            if(x>= list.length)
               x=0;
          
         }
      });
      add(pic);
      try {
			DealyMethod(1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      tm.start();
     
     setLayout(null);
      setSize(805,505);//Jframe.setBounds(100, 100, 805, 505);

      getContentPane().setBackground(Color.decode("#bdb67b"));
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }   
  
   public void SetImageSize(int i){
      ImageIcon icon= new ImageIcon(list[i]);
      Image img= icon.getImage();
      Image newImg= img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon newImc= new ImageIcon(newImg);
      pic.setIcon(newImc);
   }
   
  public static void main(String[] args){
	  new subway();
      
   }
  public void DealyMethod(int delayTime) throws Exception{
		int mdelayTime;
		mdelayTime = delayTime * 1000;
		Robot robot = new Robot();
		robot.delay(mdelayTime);
	}
}


