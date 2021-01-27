package collection;

public class Demo {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		int d=2;
		String s="helloworld";
		dosome(p,d,s);
		System.out.println(p);
		System.out.println(d);
		System.out.println(s);

	}
	public static void dosome(Point p,int d,String s) {
		/*
		 * 值传递,引用类型传地址,当重新创建一个对象的时候,方法栈里面的地址改变
		 * 当方法调用结束后,栈会被清空,对象会被GC回收,
		 */
		
		
		
		//p=new Point (3,4);//重新在方法里面new一个对象
		d=d+1;
		s=s.toUpperCase();//String 类型的数据是不可变的,一旦改变等于创建一个新对象
		p.setX(3);
	}

}
