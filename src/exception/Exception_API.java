package exception;

public class Exception_API {
	/*
	 * Exception ��������API:
	 * printStackTrace();
	 * getMessage();
	 */

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str="a";
			System.out.println(Integer.parseInt(str));
		}catch(Exception e) {
			e.printStackTrace();
			String massage=e.getMessage();
			System.out.println(massage);
			System.out.println("������");
		}
		System.out.println("���������");

	}

}
