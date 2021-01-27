package collection;

import java.util.ArrayList;
import java.util.Collection;
/**
 * boolean add(e)在末尾增加元素
 * boolean remove(e)用equals删除一个元素
 */

public class Collection_contains {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(2,3));
		c.add(new Point(3,4));
		System.out.println(c);
		
		Point p=new Point(1,2);
		System.out.println(c.contains(p));//如果不重写equals,则false
		
		c.add(new Point(1,2));
		c.remove(p);//如果没有重写equals,则删除不成功,且只能删除一个元素
		System.out.println(c);

	}

}
