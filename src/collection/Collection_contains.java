package collection;

import java.util.ArrayList;
import java.util.Collection;
/**
 * boolean add(e)��ĩβ����Ԫ��
 * boolean remove(e)��equalsɾ��һ��Ԫ��
 */

public class Collection_contains {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(2,3));
		c.add(new Point(3,4));
		System.out.println(c);
		
		Point p=new Point(1,2);
		System.out.println(c.contains(p));//�������дequals,��false
		
		c.add(new Point(1,2));
		c.remove(p);//���û����дequals,��ɾ�����ɹ�,��ֻ��ɾ��һ��Ԫ��
		System.out.println(c);

	}

}
