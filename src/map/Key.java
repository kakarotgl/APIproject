package map;
/**
 * HashMapɢ�б��ǵ����ѯ�ٶ��������ݽṹ.���ڲ�������ʵ��,
 * ����HashMap�Ǹ���keyͨ�������㷨��������������λ��,
 * ��ͱ����˶�����ı���.�Ӷ���ѯ�ٶȲ������ݶ��ٶ��仯
 * ����Key��HashMap�о���λ��,������hashCode������
 * equals����Ҫ���ƴ���.Object�ж������������������hashMap
 * ʹ�ù���.������ܻ���hashMap�в��������Ӱ���ѯ�ٶ�
 * ��key��hashCodeֵ��ͬ,����equals�Ƚϲ�Ϊtrueʱ
 * �ͻ���HashMap�в�������
 * @author uid
 *API�ֲ���Object�����������������д����ȷ��˵��:
 *1: �ɶ���д
 *   ��������Ҫ��дһ�����equals������Ӧ����ͬ��дhashCode����
 *2:һ����
 *  ����������equals�Ƚ�Ϊtrueʱ,��ôhashCode�������ص����ֱ�����ͬ
 *  ��֮��Ȼ,��Ȼ���Ǳ����,����Ӧ��������֤��������hashCode��ͬʱequalsҲΪtrue,
 *  �������HashMap�в�������,Ӱ���ѯ����
 *3:�ȶ���
 *  ��һ���������equals�Ƚϵ�����ֵû�з����ı��ǰ���¶�ε���hashCode����
 *  ���ص�����Ӧ������.
 */

public class Key {
	private int x;
	private int y;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



	public static void main(String[] args) {
		
	}
	
	

}
