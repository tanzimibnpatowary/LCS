package sessionapril;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 24, 2020 11:12:09 AM
 */
public class Date {
	public static int daysBetweenDates(String date1, String date2) {
		// DateFormatter mFormatter = new DateFormatter(date1);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date1 = "";
		String date2 = "";
		System.out.println(daysBetweenDates(date1, date2));
		LocalDate dateBefore = LocalDate.parse(date1);
		LocalDate dateAfter = LocalDate.parse(date2);
		int d = (int) Math.abs(ChronoUnit.DAYS.between(dateBefore, dateAfter));
		System.out.println(d);
	}

}
