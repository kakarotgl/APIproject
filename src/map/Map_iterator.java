package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * 遍历Map有三种方式:
 * 1:遍历所有的key
 * 2:遍历每一组键值对
 * 3:遍历所有的value值(相对不常用)
 * @author uid
 *
 */

public class Map_iterator {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学",98);
		map.put("英语",94);
		map.put("物理", 90);
		map.put("化学", 89);
		
		/*
		 * 遍历每个key
		 * Set<k> keySet();
		 * 将当前Map中的所有的key存入一个Set集合后返回.
		 */
		
		Set<String> keySet=map.keySet();
		for(String key:keySet) {
			System.out.println(key);
		}
		
		/*
		 * 遍历每组键值对
		 * Set<entry> entrySet();
		 * Entry是Map的内部接口,用于表示当前Map中的一组键值对
		 * 其提供了两个常用的方法:
		 * K getKey():获取key 的值
		 * V getValue():获取value的值
		 * 不同的Map实现类都实现了Entry接口,
		 * 使用实现类的实例表示一组键值对
		 */
		
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> e:entrySet) {
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * 遍历所有的value
		 * Collection<V> values();
		 * 返回当前Map中所有的value值
		 */
		
		Collection<Integer> values=map.values();
		for(Integer value:values) {
			System.out.println("value:"+value);
		}
		

	}

}
