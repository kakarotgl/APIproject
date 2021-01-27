package date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 计算商品促销日期
 * 程序启动后,要求输入某商品的生产日期以及保质期的天数,然后经过计算输出促销日期
 * 促销日期的定义为:商品过期日前两周的周三
 * 
 * 例如:
 * 生产日期为2018-01-29日
 * 保质期14天
 * 那么促销日应当为2018-01-31日
 * @author uid
 *
 */
public class Test2 {

	public static void main(String[] args) throws IOException, ParseException {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("请输入生产日期:");
//		String str=scan.next();
//		System.out.println("请输入保质期:");
//	    int deadLine=scan.nextInt();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入生产日期:");
	    String str=br.readLine();
	    System.out.println("请输入保质期:");
	    int deadLine=Integer.parseInt(br.readLine());
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		Date date=sdf.parse(str);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.DAY_OF_YEAR, deadLine);
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		date=calendar.getTime();
		String line=sdf.format(date);
		
		System.out.println("促销日为:"+line);
		

	}

}
