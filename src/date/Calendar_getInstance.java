package date;

import java.util.Calendar;

/**
 * java.util.Calendar
 * 日历类
 * 日历类是用来计算和操作时间的类.本身是一个抽象类
 * 常用实现类:java.util.GregorianCalendar,即
 * 阳历历法
 * 
 * Calendar提供了一个抽象方法:getInstance用来获取当前系统所在地区适用的实现类
 * 大部分地区获取的都是阳历历法实现类
 * 
 * @author uid
 *
 */
public class Calendar_getInstance {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * Calendar默认也表示当前系统时间,只是输出的内容不直接表示日期
		 */
		System.out.println(calendar);

	}

}
