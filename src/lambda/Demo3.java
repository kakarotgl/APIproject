package lambda;
/*
 * JDK8��,����Ϊlambda�ṩ�˱�������,���Ҹ÷��������԰�ȫ��.
 */
import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		for(String s:list) {
			System.out.println(s);
		}
		
		list.forEach((e)->System.out.println(e));

	}

}
