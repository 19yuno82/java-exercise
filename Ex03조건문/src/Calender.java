import java.util.Calendar;

public class Calender {

	public static Calendar getInstance() {
		// 클래스 관련 이해가 부족하다
		Calendar cal = Calendar.getInstance();
		int yyyy = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.println(yyyy+"년"+ month+"월"+hour+"시"+minute+"분");
		
		return null;
	}

}
