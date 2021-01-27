package exception;

public class Exception_finally {
	/*
	 * finally块被定义在异常捕获机制的最后,即:
	 * 最后一个catch之后,或者直接跟在try之后.
	 * 
	 * finally块可以确保只要程序执行到try块中的代码
	 * 那么finally里面的代码就一定会被执行.
	 * 通常会将无论程序是否出错都要运行的代码放在finally块中
	 * 确保执行,比如IO操作中的关闭流
	 */

	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try {
			String str="a";
			System.out.println(str.length());
			return;
		}catch(Exception e) {
			System.out.println("出错了");
		}finally {//无论是否执行了return,finally中的代码都一定会执行
			System.out.println("finally中的代码执行了");
		}

	}

}
