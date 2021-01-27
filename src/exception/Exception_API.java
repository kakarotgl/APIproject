package exception;

public class Exception_API {
	/*
	 * Exception 两个常用API:
	 * printStackTrace();
	 * getMessage();
	 */

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str="a";
			System.out.println(Integer.parseInt(str));
		}catch(Exception e) {
			e.printStackTrace();
			String massage=e.getMessage();
			System.out.println(massage);
			System.out.println("出错了");
		}
		System.out.println("程序结束了");

	}

}
