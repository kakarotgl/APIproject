package date;

import java.util.Calendar;

/**
 * java.util.Calendar
 * ������
 * ����������������Ͳ���ʱ�����.������һ��������
 * ����ʵ����:java.util.GregorianCalendar,��
 * ��������
 * 
 * Calendar�ṩ��һ�����󷽷�:getInstance������ȡ��ǰϵͳ���ڵ������õ�ʵ����
 * �󲿷ֵ�����ȡ�Ķ�����������ʵ����
 * 
 * @author uid
 *
 */
public class Calendar_getInstance {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * CalendarĬ��Ҳ��ʾ��ǰϵͳʱ��,ֻ����������ݲ�ֱ�ӱ�ʾ����
		 */
		System.out.println(calendar);

	}

}
