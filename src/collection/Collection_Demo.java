package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Demo {
	/*
	 * JDK1.5之后推出的一个特性:泛型
	 * 泛型又称为参数化类型,在实例化某个类时指定泛型的具体类型
	 * 泛型是编译器认可的,原型是Object,指定泛型可以使编译器帮助
	 * 检测类型匹配以及做自动造型.
	 * 最常使用在集合中,用来约束集合中元素类型
	 */

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		
		//获取时编译器会自动添加类型转换
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
		
		//迭代器的泛型应当与集合泛型一致
		Iterator<String>it=c.iterator();
		while(it.hasNext()) {
			String arr=it.next();
			System.out.println(arr);
		}
		

	}

}
