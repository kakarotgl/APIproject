package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���ϵ�����
 * ���ϵĹ�����:java.util.Collections
 * �ù������ṩ�˺ܶྲ̬�������ڷ���Ĳ�������.����
 * ����sort�������ڶ�List���Ͻ�����Ȼ����:��С����
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
