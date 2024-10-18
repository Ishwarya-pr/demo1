package dailyTask;
import java.util.*;
public class DayOfWeek {
	
	public static String getDayOfWeek(String in1) {
		String datepart[] = in1.split("/");
		
		int day = Integer.parseInt(datepart[0]);
		int month = Integer.parseInt(datepart[1])-1;
		int year = Integer.parseInt(datepart[2]);
		
		Calendar cal = new GregorianCalendar();
		cal.set(year, month, day);
		
		int day1 = cal.get(Calendar.DAY_OF_WEEK);
	
		String dayString="";
		
		switch(day1) {
		case Calendar.SUNDAY:
			dayString="sunday";
			break;
		case Calendar.MONDAY:
			dayString="monday";
			break;	
		case Calendar.TUESDAY:
			dayString="tuesday";
			break;
		case Calendar.WEDNESDAY:
			dayString="wednesday";
			break;
		case Calendar.THURSDAY:
			dayString="thursay";
			break;
		case Calendar.FRIDAY:
			dayString="friday";
			break;
		case Calendar.SATURDAY:
			dayString="saturday";
			break;
		}
		return dayString;
		}
		
	
	
	public static void main(String[] args) {
		String in1="14/10/2024";
		String in2= "dd/mm/yyyy";
		System.out.println( getDayOfWeek(in1));

	}

}
