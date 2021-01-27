package date;

import java.util.Calendar;
import java.util.Date;

/**
 * 为Calendar设置指定时间分量所对应的值
 * @author uid
 *
 */
public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//设置时间:2008-8-8
		
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DAY_OF_MONTH,8);
		calendar.set(Calendar.HOUR_OF_DAY, 15);
		calendar.set(Calendar.MINUTE, 32);
		calendar.set(Calendar.SECOND, 50);
		
		/*
		 * Calendar提供了与Date互相转换的方法
		 * 1:Date getTime();
		 * 将当前Calendar表示的日期以Date形式返回
		 * 
		 * 2:void setTime(Date date)
		 * 使当前Calendar表示给定的Date所表示的日期
		 */
		
		Date date=calendar.getTime();
		System.out.println(date);

	}

}
