package date;

import java.util.Calendar;
import java.util.Date;

/**
 * ΪCalendar����ָ��ʱ���������Ӧ��ֵ
 * @author uid
 *
 */
public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//����ʱ��:2008-8-8
		
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DAY_OF_MONTH,8);
		calendar.set(Calendar.HOUR_OF_DAY, 15);
		calendar.set(Calendar.MINUTE, 32);
		calendar.set(Calendar.SECOND, 50);
		
		/*
		 * Calendar�ṩ����Date����ת���ķ���
		 * 1:Date getTime();
		 * ����ǰCalendar��ʾ��������Date��ʽ����
		 * 
		 * 2:void setTime(Date date)
		 * ʹ��ǰCalendar��ʾ������Date����ʾ������
		 */
		
		Date date=calendar.getTime();
		System.out.println(date);

	}

}
