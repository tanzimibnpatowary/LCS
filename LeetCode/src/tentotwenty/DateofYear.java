package tentotwenty;

import java.time.LocalDate;

public class DateofYear {
	public static int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mString = "2019-01-09";
		System.out.println(dayOfYear(mString));
	}

}
