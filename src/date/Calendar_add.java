package date;

import java.util.Calendar;

/**
 * Calendar用来计算时间的方法
 * void add(int field,int value)
 * 对指定时间分量加上给定的值,若给定的值为负数则是减去
 * @author uid
 *
 */
public class Calendar_add {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * 查看5年3个月25天以后那周的周一是哪天?
		 * 
		 */
		calendar.add(Calendar.YEAR, 5);
		System.out.println(calendar.getTime());//加五年后
		calendar.add(Calendar.MONTH, 3);
		System.out.println(calendar.getTime());//加三个月后
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());//加25天后
		
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		System.out.println(calendar.getTime());//那一周的周一

	}

}
