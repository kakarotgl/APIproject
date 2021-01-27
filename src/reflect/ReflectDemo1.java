package reflect;
/**
 * java 反射机制
 * 反射机制允许java程序在运行过程中动态多获取一个类的信息,
 * 如:获取类描述信息,获取该类方法签名,属性,构造方法等.并且
 * 允许动态实例化对象以及动态执行指定方法,而无需硬代码
 * 反射可以提高代码的灵活度,但是相反的也会消耗一定的资源和性能,
 * 适度使用
 * @author uid
 *
 */

public class ReflectDemo1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		Person p=new Person();
//		p.sayName();
		
		String name="reflect.Person";
		/**
		 * Class类
		 * Class类的每一个实例用于表示java中的一个类的信息
		 * JVM在加载一个类的.class文件时,会 实例化一个Class的实例
		 * 用于记录该类的信息(类的名字,有哪些属性,哪些方法等待.)并且
		 * 在JVM内部每个被加载的类都有且只有一个Class的实例与之对应
		 * 想获取某个类的Class实例查看该类信息时,可以调用Class提供的
		 * 静态方法forName,将需要查看的类的完全限定名(包名.类名)传入
		 * 即可返回该类对应的Class实例
		 * 
		 * 
		 * 加载类,获取类描述信息
		 */
		Class cls=Class.forName(name);
		/*
		 * Class提供了一个方法:newInstance,该方法会调用其表示的类的无参构造方法,来实例化该类的一个对象
		 * 
		 * 实例化该类的一个对象
		 */
		Person o=(Person)cls.newInstance();
		o.sayHello();
		
	}

}
