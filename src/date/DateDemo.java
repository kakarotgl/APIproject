package date;

import java.util.Date;

/**
 * java.util.Date
 * ������,��ÿһ��ʵ�����ڱ�ʾһ�������ʱ���.
 * �ڲ�ά��һ��longֵ,��ʾ����1970��1��1��00:00:00
 * ����ǰDateʵ������ʾ��ʱ��֮���������ĺ���ֵ
 * 
 * ����Date�������ȱ��(���ʻ�,ǧ���)���Դ󲿷ֵķ�������Ϊ��ʱ��
 * @author uid
 *
 */

public class DateDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		//date�󲿷ֵķ�����������Ϊ��ʱ��
		//date.getYear();
		
		
		/*
		 * ��ȡ�ڲ�ά���ĺ���ֵ
		 */
		long time=date.getTime();
		System.out.println(time);//��ȡ����ֵ
		
		time+=1000*60*60*24;
		date.setTime(time);//���õڶ����ʱ��,���TimeΪ0,���Ϊ1970��1��1������8��,������Ϊʱ���Ĺ�ϵ
		System.out.println(date);

	}

}
