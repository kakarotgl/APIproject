package fileDemo;

public class ParseDemo {
	/*
	 * Java 5�Ժ��ṩ���Զ�װ��.���书��
	 * AutoBoxing
	 * ���Խ�ʡ������,��߱��Ч��
	 * �����ʹ���Զ�װ��:Integer i=Integer.valueOf(500)
	 * ʹ���Զ�װ��,java������������
	 * �������(�����滻ʵ��)
	 * Integer n=500;
	 * Double d=3.14
	 * 
	 * ��ʹ���Զ�����:
	 * int k=i.intValue();
	 * double y=d.doubleValue();
	 * �Զ�����:
	 * int m=i;
	 * double z=d;
	 */


	public static void main(String[] args) {
		String str="168";
		String str2="3.14";
		
		int i=Integer.parseInt(str);
		double d=Double.parseDouble(str2);
		System.out.println(i);
		System.out.println(d);
		
		//java��ʹ�����int����ʱ��,�Զ�����Integer.toString(n),
		//��intת��Ϊ10�����ַ���,Ȼ�������;
		int n=3145;
		String s=Integer.toString(n);
		System.out.println(s);
		
		
		
		

	}

}
