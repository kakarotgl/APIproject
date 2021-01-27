package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_parse {

	public static void main(String[] args) {
		String str="2008-08-08 20:08:08";
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date date=sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		

	}

}
