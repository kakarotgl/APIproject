package collection;
/*
 * 提供额外比较器:
 * 相对于sort(List list)而言,下面的排序规则不需要集合元素必须实现Comparable接口,这样
 * 在自定义类型元素时就没有对该元素的"侵入性".所以在排序含有自定义类型元素的集合是都应当
 * 使用匿名内部类的的排序方法
 * 
 * 当元素已经实现了Comparable接口,但是其比较大小的规则不满足排序需求时,也应当使用下边的排序方法
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("苍老师");
		list.add("传奇");
		list.add("诸葛流云");
		list.add("司马懿");
		list.add("殇");
		System.out.println(list);
		
		/*Collection.sort(list)
		 * 排序字符串时,字符串自身的大小规则是按照字符的编码大小比较的
		 */
		
//MyComparator m=new MyComparator();//这是定义一个类继承Comparator比较器,重写方法来实现
		
		//额外比较器
		Collections.sort(list,new Comparator<String>() {
			public int compare(String o1, String o2) {		
		        return o1.length()-o2.length();
		    }
		});
		System.out.println(list);

	}
}
/*
 * 为字符串提供额外的比较规则,字符多的大
 */
