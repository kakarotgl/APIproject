package collection;
/*
 * 使用新循环遍历集合
 */
import java.util.ArrayList;
import java.util.Collection;

public class NewForDemo2 {
	/*
	 * 新循环遍历集合就是迭代器遍历集合,所以不要在遍历过程中
	 * 通过集合的方法增删元素
	 */

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
		for(Object o:c) {
			String str=(String)o;
			System.out.println(str);
			/*
			if("#".equals(str)) {
				c.remove(str);
			}*/
		}
		
		

	}

}
