package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * Collection�ṩ��һ������:
 * toArray();
 * @author uid
 *
 */

public class CollectionToArrayDemo {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		String[] array=c.toArray(new String[5]);//�ڴ�ֻ�ܴ�,����С,��Ȼϵͳ���Զ����ÿ��õ�
		System.out.println(array.length);
		for(String str:array) {
			System.out.println(str);
		}

	}

}
