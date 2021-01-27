package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * Arrays是数组的工具类,其提供了一个静态方法:asList();
 * 可以将给定的数组转换为List集合
 * 
 * 不能对转换成的集合进行增删操作
 * 只能重新new一个集合
 * @author uid
 *
 */

public class ArrayToListDemo {

	public static void main(String[] args) {
		String[] array= {"one","two","three","four"};
		List<String> list=Arrays.asList(array);
		
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(array));//数组元素也改变
		//list.add("five");
		//list.remove(2);
		
		List<String> list2=new ArrayList(list);
		list2.remove("four");
		System.out.println(list2);

	}

}
