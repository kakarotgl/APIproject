package reflect;

public class Person {
	public void sayHello() {
		System.out.println("��Һ�!");
	}
	
	public void sayName() {
		System.out.println("�ҽ�����");
	}
	
	public void sayAge(int age) {
		System.out.println("�ҵ�����ʱ:"+age+"��");
	}
	
	public void say(String name,int age) {
		System.out.println("�ҽ�"+name+",�ҽ���"+age+"����");
	}
	
	private void dosome() {
		System.out.println("����person���˽�г�Ա����!");
	}

}
