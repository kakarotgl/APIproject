package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Demo {
	/*
	 * JDK1.5֮���Ƴ���һ������:����
	 * �����ֳ�Ϊ����������,��ʵ����ĳ����ʱָ�����͵ľ�������
	 * �����Ǳ������Ͽɵ�,ԭ����Object,ָ�����Ϳ���ʹ����������
	 * �������ƥ���Լ����Զ�����.
	 * �ʹ���ڼ�����,����Լ��������Ԫ������
	 */

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		
		//��ȡʱ���������Զ��������ת��
		for(String str:c) {
			System.out.println(str);
		}
		
		/*Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(1);
		c2.add(3);
		c2.add(5);
		c2.add(7);
		c2.add(9);
		System.out.println(c2);
		
		for(int i:c2) {
			System.out.println(i);
		}*/
		
		//�������ķ���Ӧ���뼯�Ϸ���һ��
		Iterator<String>it=c.iterator();
		while(it.hasNext()) {
			String arr=it.next();
			System.out.println(arr);
		}
		

	}

}
