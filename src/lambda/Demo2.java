package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		Random random=new Random();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		
//		Collections.sort(list,new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//		});
		
		
		/*
		 * lambda表达式实现的方法若只有一句话,且含有return时,忽略{}的同时,也要忽略return;
		 */
		Collections.sort(list,(o1,o2)->o2-o1);
		
		System.out.println(list);

	}

}
