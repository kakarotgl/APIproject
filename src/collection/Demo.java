package collection;

public class Demo {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		int d=2;
		String s="helloworld";
		dosome(p,d,s);
		System.out.println(p);
		System.out.println(d);
		System.out.println(s);

	}
	public static void dosome(Point p,int d,String s) {
		/*
		 * ֵ����,�������ʹ���ַ,�����´���һ�������ʱ��,����ջ����ĵ�ַ�ı�
		 * ���������ý�����,ջ�ᱻ���,����ᱻGC����,
		 */
		
		
		
		//p=new Point (3,4);//�����ڷ�������newһ������
		d=d+1;
		s=s.toUpperCase();//String ���͵������ǲ��ɱ��,һ���ı���ڴ���һ���¶���
		p.setX(3);
	}

}
