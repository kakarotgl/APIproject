package date;

import java.util.Calendar;

public class Calendar_test {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		for(int i=0;i<20;i++) {
		   calendar.set(Calendar.YEAR, ++year);
		   int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		   System.out.println(calendar.get(Calendar.YEAR)+"ÄêÓÐ"+days+"Ìì");
		}
		
		for(double i=0;i<100;i++){
			System.out.println((int)100*i/99);
		}

	}

}
