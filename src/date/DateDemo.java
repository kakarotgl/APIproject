package date;

import java.util.Date;

/**
 * java.util.Date
 * 日期类,其每一个实例用于表示一个具体的时间点.
 * 内部维护一个long值,表示的自1970年1月1日00:00:00
 * 到当前Date实例所表示的时间之间所经过的毫秒值
 * 
 * 由于Date存在设计缺陷(国际化,千年虫)所以大部分的方法声明为过时的
 * @author uid
 *
 */

public class DateDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		//date大部分的方法都被声明为过时的
		//date.getYear();
		
		
		/*
		 * 获取内部维护的毫秒值
		 */
		long time=date.getTime();
		System.out.println(time);//获取毫秒值
		
		time+=1000*60*60*24;
		date.setTime(time);//设置第二天的时间,如果Time为0,输出为1970年1月1日早上8点,这是因为时区的关系
		System.out.println(date);

	}

}
