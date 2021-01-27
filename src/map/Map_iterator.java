package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * ����Map�����ַ�ʽ:
 * 1:�������е�key
 * 2:����ÿһ���ֵ��
 * 3:�������е�valueֵ(��Բ�����)
 * @author uid
 *
 */

public class Map_iterator {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ",98);
		map.put("Ӣ��",94);
		map.put("����", 90);
		map.put("��ѧ", 89);
		
		/*
		 * ����ÿ��key
		 * Set<k> keySet();
		 * ����ǰMap�е����е�key����һ��Set���Ϻ󷵻�.
		 */
		
		Set<String> keySet=map.keySet();
		for(String key:keySet) {
			System.out.println(key);
		}
		
		/*
		 * ����ÿ���ֵ��
		 * Set<entry> entrySet();
		 * Entry��Map���ڲ��ӿ�,���ڱ�ʾ��ǰMap�е�һ���ֵ��
		 * ���ṩ���������õķ���:
		 * K getKey():��ȡkey ��ֵ
		 * V getValue():��ȡvalue��ֵ
		 * ��ͬ��Mapʵ���඼ʵ����Entry�ӿ�,
		 * ʹ��ʵ�����ʵ����ʾһ���ֵ��
		 */
		
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> e:entrySet) {
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * �������е�value
		 * Collection<V> values();
		 * ���ص�ǰMap�����е�valueֵ
		 */
		
		Collection<Integer> values=map.values();
		for(Integer value:values) {
			System.out.println("value:"+value);
		}
		

	}

}
