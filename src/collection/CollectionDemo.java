package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java集合框架
 * java.util.Collection
 * java中及所有的集合都实现了Collection接口
 * 
 * Collection下面有两个常用的子接口:
 * list:线性表,可重复的集合,且有序.
 * set:不可重复的集合.
 * 元素是否重复取决于元素的equals比较结果
 */

public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add("e");
		c.add('a');
		System.out.println(c);
		System.out.println("集合个数为:"+c.size());
		System.out.println("是否为空:"+c.isEmpty());
		
		c.clear();
		System.out.println("集合已清空");
		System.out.println("集合个数为:"+c.size());
		System.out.println("是否为空:"+c.isEmpty());
		
	}

}
