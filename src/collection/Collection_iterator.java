package collection;
/*
 * 迭代器常用三个方法:
 * hasnext();是否有下一个,如果仍有元素可以迭代，则返回 true。
 * next();返回迭代的下一个元素。
 * remove();删除
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection提供了统一的遍历集合元素的方式:迭代器
 * 方法为:
 * Iterator iterator()
 * 该方法可以获取一个可以遍历当前集合元素的迭代器
 * @author uid
 * 
 * java.util.Iterator接口
 * 迭代器接口规定了用于遍历集合的相关方法.不同的集合都实现了一个
 * 迭代器的实现类用于遍历自身.我们无需记住每种迭代器实现类的名字,
 * 只需要将其看做Iterator遍历集合即可.
 * 
 * 迭代器遍历集合的通用模式:
 * 遵循:问,取,删
 * 其中删除元素不是遍历元素时的必要操作.
 *
 */
public class Collection_iterator {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		/*
		c.add("");
		c.add(null);//可以加入null字符
		*/
		System.out.println(c);
		
		Iterator i=c.iterator();
		String s;
		while(i.hasNext()) {
			s=(String)i.next();
			System.out.println(s);
			/*
			 * 在使用迭代器遍历集合的过程中
			 * 不能通过集合的方法增删元素
			 * 迭代器提供了remove方法,该方法不需要
			 * 传入产生,他是将通过next方法
			 * 遍历处理的元素从集合中删除
			 */
			if("#".equals(s)) {
				//c.remove(s);
				i.remove();
			}
		}
		System.out.println(c);

	}

}
