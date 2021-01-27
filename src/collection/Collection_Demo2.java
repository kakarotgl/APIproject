package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Demo2 {

	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		for(int i:c) {
			System.out.println(i);
		}
		
		Collection c2=c;
		c2.add("Hello");
		System.out.println(c2);
		
		/*for(int j:c) {
			System.out.println(j);
		}*/

	}

}
