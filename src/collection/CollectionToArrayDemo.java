package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection提供了一个方法:
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
		
		String[] array=c.toArray(new String[5]);//内存只能大,不能小,不然系统会自动调用可用的
		System.out.println(array.length);
		for(String str:array) {
			System.out.println(str);
		}

	}

}
