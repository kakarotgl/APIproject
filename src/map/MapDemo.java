package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map接口
 * Map称为"查找表"
 * Map是常用的数据结构,体现的样子是一个多行两列的表格
 * 左列称为key,右列称为value.存储元素总是key=value成对存入
 * 而获取值时,是根据key获取其对应的value
 * Map要求key不允许重复(使用key元素equals判断重复)
 * 
 * 常用实现类:java.util.HashMap
 * HashMap是使用散列算法实现的,俗称散列表.
 * HashMap是当今查询速度最快的数据结构
 * @author uid
 *
 */

public class MapDemo {
	public static void main(String[] args) {
		/*
		 * v put(K k,V v)
		 * 将给定的key-value对存入Map
		 * 
		 * 由于Map不允许存放重复的key,所以若使用
		 * Map已有的key存放一个新value时,
		 * 则替换该key原来对应的value值,那么put方法返回的就是
		 * 被替换的这个value值,若key不存在则put方法返回null
		 */
		Map<String,Integer> map=new <String,Integer>HashMap();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 96);
		map.put("物理", 97);
		Integer value=map.put("化学", 88);//由于没有化学,存入一个化学关键字,返回null
		//在这里不能用int,因为null不能调用方法,null.intValue()是错误的(自动拆箱)
		System.out.println(value);//null
		System.out.println(map);
		
		Integer value2=map.put("语文", 77);
		//int value2=map.put("语文", 77);//这里可以用int
		System.out.println(value2);//99
		//由于已经有"语文"关键字,value替换,返回被替换的值
		
		System.out.println(map);
		
		
		value=map.get("化学");
		System.out.println("化学:"+value);
		
		value=map.get("体育");
		System.out.println("体育:"+value);
		
		
		/*
		 * V remove(K k)
		 * 根据给定的key将对应的key-value对删除
		 * 返回值为该key对应的value
		 * 若给定的key在Map中不存在,则不会删除任何内容,返回值也为null
		 */
		
		
		value=map.remove("英语");
		System.out.println(map);
		System.out.println(value);
		
		value=map.remove("生物");
		System.out.println(value);
		
		//size();查看map有多少对值
		int size=map.size();
		System.out.println("size:"+size);
	}

}
