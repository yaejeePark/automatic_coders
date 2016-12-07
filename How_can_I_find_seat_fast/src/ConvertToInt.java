
public class ConvertToInt {
	private int intStation;
	public int ConvertToInt(String station){
		switch(station){
		case "선릉": 
			return 1;
		case "한티": 
			return 2;
		case "도곡": 
			return 3;
		case "구룡": 
			return 4;
		case "개포동": 
			return 5;
		case "대모산입구": 
			return 6;
		case "수서": 
			return 7;
		case "복정": 
			return 8;
		case "가천대": 
			return 9;
		default:
			return 0;
		}
	}
}
