import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetCurrentTimeExam {
	
	public static String GetCurrentTimeExam(){
		//long time = System.currentTimeMillis();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = dateFormat.format(calendar.getTime()); 		
		
		return str;	
		
		}
}
