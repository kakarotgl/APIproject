package date;

import java.util.Calendar;

/**
 * Calendar��������ʱ��ķ���
 * void add(int field,int value)
 * ��ָ��ʱ��������ϸ�����ֵ,��������ֵΪ�������Ǽ�ȥ
 * @author uid
 *
 */
public class Calendar_add {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * �鿴5��3����25���Ժ����ܵ���һ������?
		 * 
		 */
		calendar.add(Calendar.YEAR, 5);
		System.out.println(calendar.getTime());//�������
		calendar.add(Calendar.MONTH, 3);
		System.out.println(calendar.getTime());//�������º�
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());//��25���
		
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		System.out.println(calendar.getTime());//��һ�ܵ���һ

	}

}
