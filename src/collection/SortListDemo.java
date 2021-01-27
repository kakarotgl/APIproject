package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序
 * 集合的工具类:java.util.Collections
 * 该工具类提供了很多静态方法用于方便的操作集合.其中
 * 就有sort方法用于对List集合进行自然排序:从小到大
 * @author uid
 *
 */

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random ran=new Random();
		for(int i=0;i<10;i++) {
			list.add(ran.nextInt(100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
