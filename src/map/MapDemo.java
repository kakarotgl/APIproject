package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map�ӿ�
 * Map��Ϊ"���ұ�"
 * Map�ǳ��õ����ݽṹ,���ֵ�������һ���������еı��
 * ���г�Ϊkey,���г�Ϊvalue.�洢Ԫ������key=value�ɶԴ���
 * ����ȡֵʱ,�Ǹ���key��ȡ���Ӧ��value
 * MapҪ��key�������ظ�(ʹ��keyԪ��equals�ж��ظ�)
 * 
 * ����ʵ����:java.util.HashMap
 * HashMap��ʹ��ɢ���㷨ʵ�ֵ�,�׳�ɢ�б�.
 * HashMap�ǵ����ѯ�ٶ��������ݽṹ
 * @author uid
 *
 */

public class MapDemo {
	public static void main(String[] args) {
		/*
		 * v put(K k,V v)
		 * ��������key-value�Դ���Map
		 * 
		 * ����Map���������ظ���key,������ʹ��
		 * Map���е�key���һ����valueʱ,
		 * ���滻��keyԭ����Ӧ��valueֵ,��ôput�������صľ���
		 * ���滻�����valueֵ,��key��������put��������null
		 */
		Map<String,Integer> map=new <String,Integer>HashMap();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 96);
		map.put("����", 97);
		Integer value=map.put("��ѧ", 88);//����û�л�ѧ,����һ����ѧ�ؼ���,����null
		//�����ﲻ����int,��Ϊnull���ܵ��÷���,null.intValue()�Ǵ����(�Զ�����)
		System.out.println(value);//null
		System.out.println(map);
		
		Integer value2=map.put("����", 77);
		//int value2=map.put("����", 77);//���������int
		System.out.println(value2);//99
		//�����Ѿ���"����"�ؼ���,value�滻,���ر��滻��ֵ
		
		System.out.println(map);
		
		
		value=map.get("��ѧ");
		System.out.println("��ѧ:"+value);
		
		value=map.get("����");
		System.out.println("����:"+value);
		
		
		/*
		 * V remove(K k)
		 * ���ݸ�����key����Ӧ��key-value��ɾ��
		 * ����ֵΪ��key��Ӧ��value
		 * ��������key��Map�в�����,�򲻻�ɾ���κ�����,����ֵҲΪnull
		 */
		
		
		value=map.remove("Ӣ��");
		System.out.println(map);
		System.out.println(value);
		
		value=map.remove("����");
		System.out.println(value);
		
		//size();�鿴map�ж��ٶ�ֵ
		int size=map.size();
		System.out.println("size:"+size);
	}

}
