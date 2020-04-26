package tentotwenty;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateofTheWeek {
	 public static String dayOfTheWeek(int day, int month, int year) {
		 LocalDate date = LocalDate.of(year, month, day);
		 DayOfWeek mDayOfWeek = date.getDayOfWeek();
	     return mDayOfWeek.getDisplayName(TextStyle.FULL, Locale.US); 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 31, month = 8, year = 2019;
		System.out.println(dayOfTheWeek(day, month, year));
	}

}
