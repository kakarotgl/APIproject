package exception;

public class Exception_try_catch {
	/*
	 * 异常捕获机制:try-catch
	 * 格式:
	 * try{
	 * 可能会出错的代码片段
	 * }catch(xxxException e){//指定要捕获的异常类型
	 *         处理try块中被捕获的xxxException 后的解决手段
	 *  }
	 * 需要注意,try块不能单独定义,后面必须跟catch块
	 * 或者finally块.
	 */

	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try {
			String str=null;
			System.out.println("你猜我会不会被输出? 会");//会
		    System.out.println(str.length());
		    //try代码块中出错代码下面的内容都不会执行
		    System.out.println("你再猜我会不会被输出? 不会");//不会
		}catch(NullPointerException e) {//关注了这种错误
			System.out.println("出现了空指针");
		}
		
		
		System.out.println("程序结束了");

	}

}
