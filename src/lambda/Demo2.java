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
		 * lambda���ʽʵ�ֵķ�����ֻ��һ�仰,�Һ���returnʱ,����{}��ͬʱ,ҲҪ����return;
		 */
		Collections.sort(list,(o1,o2)->o2-o1);
		
		System.out.println(list);

	}

}
