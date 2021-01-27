package stringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		int c=1;
		StringBuilder buf=new StringBuilder();
		System.out.println(buf+"  "+c++);//                      1
		//length() �����������Ч�ַ�����
		System.out.println(buf.length()+"  "+c++);//��Ч�ַ�����;  2
		
		//capacity() ����:�ַ������ʵ�ʳ���
		System.out.println(buf.capacity()+"  "+c++);//����                 3
		
		buf.append("��ϣ��");
		System.out.println(buf.length()+"  "+c++);//              4
		System.out.println(buf.capacity()+"  "+c++);//             5 
		
		
		buf.append("��һ���ڼҵ�ʱ��");
		buf.insert(3, "��˵");
		System.out.println(buf+"  "+c++);//               6
		
		buf.delete(10, 14);
		System.out.println(buf+"  "+c++);//                 7
		
		buf.replace(1,3,"��ʪ");//==(1,1+2,"��ʪ")
		System.out.println(buf+"  "+c++);//                 8
		
		buf.append("�Լ�");
		System.out.println(buf+"  "+c++);//                9 
		
		buf.reverse();
		System.out.println(buf+"  "+c++);//                 10
		
		
		

	}

}
