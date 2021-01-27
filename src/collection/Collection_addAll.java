package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Collection_addAll {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c#");
		c1.add("c++");
		System.out.println(c1);
		
		Collection c2=new HashSet();
		c2.add("android");
		c2.add("ios");
		c2.add("java");
		System.out.println(c2);
		/**
		 * boolean addAll(Collection c);
		 * �����������е�����Ԫ����ӵ���ǰ����
		 */
		/*boolean b1=c1.addAll(c2);
		System.out.println(b1);
		System.out.println(c1);*/
		
		boolean b2=c2.addAll(c1);
		//ֻҪ�������Ԫ���б仯,��Ϊtrue,��һ��ȫ��Ԫ�ؽ�ȥ
		System.out.println(b2);
		System.out.println(c2);
		
		/**
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 * �жϱ�׼��Ȼ������equals�ȽϵĽ��
		 */
		boolean b3=c2.containsAll(c1);
		System.out.println(b3);
		
		/**
		 * boolean removeAll(Collection c)
		 * ����ǰ����������������еĹ���Ԫ��ɾ��(����)
		 * 
		 */
		boolean b4=c2.removeAll(c1);
		System.out.println(b4);
		System.out.println(c2);

	}

}
