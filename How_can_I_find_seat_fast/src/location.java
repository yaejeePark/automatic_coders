//package time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class location {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Calendar calendar = Calendar.getInstance();
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         
         
         String s = dateFormat.format(calendar.getTime());
         System.out.println(s);
      String mm = s.substring(14, 16);
       int new_mm = Integer.parseInt(mm);
      String ss=s.substring(17,19);
      int new_ss = Integer.parseInt(ss);
      int sum = new_ss+(new_mm*60);
      
      if(sum>=0 && sum<=10)
         System.out.println("선릉역입니다");
      else if(sum>10&&sum<=110)
         System.out.println("선릉-->한티역입니다");
      else if(sum>110&&sum<=130)
         System.out.println("한티역입니다");
      else if(sum>130&&sum<=230)
         System.out.println("한티-->도곡역입니다");
      else if(sum>230&&sum<=250)
         System.out.println("도곡역입니다");
      else if(sum>250&&sum<=350)
         System.out.println("도곡-->구룡역입니다");
      else if(sum>350&&sum<=370)
         System.out.println("구룡역입니다");
      else if(sum>370&&sum<=470)
         System.out.println("구룡-->개포동역입니다");
      else if(sum>470&&sum<=490)
         System.out.println("개포동역입니다");
      else if(sum>490&&sum<=590)
         System.out.println("개포동-->대모산입구역입니다");
      else if(sum>590&&sum<=610)
         System.out.println("대모산입구역입니다");
      else if(sum>610&&sum<=710)
         System.out.println("대모산입구-->수서역입니다");
      else if(sum>710&&sum<=730)
         System.out.println("수서역입니다");
      else if(sum>730&&sum<=930)
         System.out.println("수서-->복정역입니다");
      else if(sum>930&&sum<=950)
         System.out.println("복정역입니다");
      else if(sum>950&&sum<=1150)
         System.out.println("복정-->가천대역입니다");
      else if(sum>1150&&sum<=1200)
         System.out.println("가천대역입니다");
   }

}
