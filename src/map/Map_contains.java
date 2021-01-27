package map;

import java.util.HashMap;
import java.util.Map;

public class Map_contains {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学",98);
		map.put("英语", 92);
		map.put("物理", 89);
		map.put("化学", 80);
		System.out.println(map);
		
		/*
		 * boolean containsKey(K k)
		 * boolean containsValue(V v)
		 */
		
		boolean ck=map.containsKey("语文");
		System.out.println("包含key:"+ck);
		
		boolean cv=map.containsValue(99);
		System.out.println("包含Value:"+cv);

	}

}
