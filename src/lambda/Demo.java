package lambda;
/**
 * lambda表达式
 * JDK1.8之后推出一个新特性
 * 
 * lambda特性也是编译器认可的,用来简化对于仅有一个方法的匿名内部类的创建
 * 但是编译器在编译程序后还是会将lambda改为传统形式
 * 
 * lambda 语法:
 * 基本组成部分:
 * (arg1,arg2....)->{语句....}
 * 若语句块只有一句,则{}可以省略.
 */
public class Demo {

	public static void main(String[] args) {
//		Runnable runn=new Runnable() {
//			public void run() {
//				System.out.println("啦啦啦!");
//			}
//		};
		
		Runnable runn=()->System.out.println("啦啦啦");
		
		Thread t=new Thread(runn);
		t.start();

	}

}
