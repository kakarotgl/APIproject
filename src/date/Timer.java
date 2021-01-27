package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 练习:
 * 电子表功能
 * 要求每秒向控制台输出一次当前系统时间
 * 格式如:
 * 10:24:33
 * @author uid
 *
 */
public class Timer {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");

		long time=date.getTime();
		while(true) {
			
			System.out.println(format.format(date));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time+=1000;
			date.setTime(time);	
		}
		

	}

}
