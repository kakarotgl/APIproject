package reflect;

public class Person {
	public void sayHello() {
		System.out.println("大家好!");
	}
	
	public void sayName() {
		System.out.println("我叫张三");
	}
	
	public void sayAge(int age) {
		System.out.println("我的年龄时:"+age+"岁");
	}
	
	public void say(String name,int age) {
		System.out.println("我叫"+name+",我今年"+age+"岁了");
	}
	
	private void dosome() {
		System.out.println("我是person类的私有成员方法!");
	}

}
