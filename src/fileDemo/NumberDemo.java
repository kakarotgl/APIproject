package fileDemo;

public class NumberDemo {

	
	/*
	 *����װ����ת��Ϊ��������ʱ��,������Щ����!
	 *
	 *����ǻ�������֮���ת��,��ֱ��ʹ������ת��;
	 */
	public static void main(String[] args) {
		Integer i=new Integer(500);
		double x1=i.doubleValue();
		System.out.println(x1);
		
		Long l=new Long(600);
		double x2=l.doubleValue();
		System.out.println(x2);
		
		Double d=new Double(33.33);
		int x3=d.intValue();
		System.out.println(x3);
		
		Short s=new Short((short) 321);
		float x4=s.floatValue();
		System.out.println(x4);
		
		Float f=new Float(12.5f);
		int x5=f.intValue();
		System.out.println(x5);

	}

}
