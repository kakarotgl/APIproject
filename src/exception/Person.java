package exception;

public class Person {
	/*
	 * ��һ��������ʹ��throw�׳�һ���쳣ʱ,��Ҫ�ڵ�ǰ������ʹ��throws
	 * ���������쳣���׳�,ֻ��RuntimeException�������಻��Ҫ,������벻ͨ��.
	 * throws������ʱ������ʾ�����߸÷������ܻ��׳����쳣ʹ���ڵ��õ�ǰ����ʱ
	 * ע�Ⲷ����쳣
	 * @param(����)age
	 * @throws Exception
	 */
	private int age;
	
	public void setAge(int age) throws IllegalAgeException{//�����ö��Ÿ���ͬʱ��������쳣
		if(age>0||age>100) {
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	

}
