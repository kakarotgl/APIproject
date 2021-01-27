package date;

import java.util.Calendar;

/**
 * 获取当前Calendar所表示的日期相关信息
 * 
 * int get(int field)
 * 获取指定时间分量所对应的值.
 * 时间分量是一个数字,不同的值表示不同的含义,无需记忆可以直接使用
 * Calendar提供的常量即可
 * 
 * @author uid
 *
 */
public class Calendar_get {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;//第一个月为0,最后一个月为11,需要加1;
		int day=calendar.get(Calendar.DAY_OF_MONTH);

		int week=calendar.get(Calendar.DAY_OF_WEEK)-1;//星期天为第一天;
		String[] data= {"日","一","二","三","四","五","六"};
		
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		
		System.out.println(year+"年"+month+"月"+day+"日,星期"+data[week]);
		System.out.println(h+":"+m+":"+s);
		
		/*
		 * 获取指定时间分量所允许的最大值
		 */
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(year+"年有"+days+"天");
		
		System.out.println(calendar.get(calendar.AM_PM));//判断是上午0还是下午1

	}

}
