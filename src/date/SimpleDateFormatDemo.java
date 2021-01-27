package date;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 该类可以按照给定的格式将字符串与Date之间相互转换
 * 
 * @author uid
 *
 */

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat format=new SimpleDateFormat("yy-M-d  hh:mm:ss");
		String line=format.format(date);
		System.out.println(line);
		

	}

}
