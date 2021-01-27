package collection;
/**
 * JDK1.5之后推出了一个新的特性:
 * 增强型for循环,也称为for each
 * 
 * 新循环不用来替代传统循环的工作,他只用来遍历集合或数组.
 * 
 * 新循环是编译器认可的,而非虚拟机
 * @author uid
 *
 */

public class NewForDemo {
	public static void main(String[] args) {
		String[] arr= {"one","two","three","four","five"};
		/*
		 * 编译器会将新循环遍历数组改为使用普通的for循环遍历
		 */
		for(String str:arr) {
			System.out.println(str);
		}
	}

}
