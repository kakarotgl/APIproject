package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后要求用户输入自己的生日,如:1992-08-02;
 * 然后经过程序计算输出:到今天位置,活了xxxx天.
 * @author uid
 */
public class Test {

	public static void main(String[] args) {
		Date date=new Date();
		long nowTime=date.getTime();//当前时间毫秒数;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入生日:");
		String birthday=scan.next();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			date=format.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long birthTime=date.getTime();//生日时间毫秒数;
		
		int livedDays=(int)((nowTime-birthTime)/1000/60/60/24);
		System.out.println(birthday+"出生至今生存了:"+livedDays+"天");
		
		long tenThousandDays=10000L*1000*60*60*24;//要加一个L转换成long型
		long ttd=birthTime+tenThousandDays;//距离生日一万天后的毫秒数;
		date.setTime(ttd);
		String ttdTime=format.format(date);
		System.out.println("一万天后的纪念日:"+ttdTime);

	}

}
