package date;

import java.util.Calendar;

/**
 * ��ȡ��ǰCalendar����ʾ�����������Ϣ
 * 
 * int get(int field)
 * ��ȡָ��ʱ���������Ӧ��ֵ.
 * ʱ�������һ������,��ͬ��ֵ��ʾ��ͬ�ĺ���,����������ֱ��ʹ��
 * Calendar�ṩ�ĳ�������
 * 
 * @author uid
 *
 */
public class Calendar_get {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;//��һ����Ϊ0,���һ����Ϊ11,��Ҫ��1;
		int day=calendar.get(Calendar.DAY_OF_MONTH);

		int week=calendar.get(Calendar.DAY_OF_WEEK)-1;//������Ϊ��һ��;
		String[] data= {"��","һ","��","��","��","��","��"};
		
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		
		System.out.println(year+"��"+month+"��"+day+"��,����"+data[week]);
		System.out.println(h+":"+m+":"+s);
		
		/*
		 * ��ȡָ��ʱ���������������ֵ
		 */
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(year+"����"+days+"��");
		
		System.out.println(calendar.get(calendar.AM_PM));//�ж�������0��������1

	}

}
