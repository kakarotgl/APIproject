package map;

import java.util.HashMap;
import java.util.Map;

public class Map_contains {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ",98);
		map.put("Ӣ��", 92);
		map.put("����", 89);
		map.put("��ѧ", 80);
		System.out.println(map);
		
		/*
		 * boolean containsKey(K k)
		 * boolean containsValue(V v)
		 */
		
		boolean ck=map.containsKey("����");
		System.out.println("����key:"+ck);
		
		boolean cv=map.containsValue(99);
		System.out.println("����Value:"+cv);

	}

}
