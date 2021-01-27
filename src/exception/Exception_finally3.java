package exception;

public class Exception_finally3 {

	public static void main(String[] args) {
		System.out.println(test("0")+"  "+10);
		System.out.println(test("")+"   "+20);
		System.out.println(test(null)+"   "+30);

	}
	
	public static int test(String str) {
		try {
			return str.charAt(0)-'0';
		}catch(NullPointerException e) {
			System.out.println("空指针异常");
			return 1;
		}catch(Exception e) {
			System.out.println("出现了其他异常");
			return 2;
		}finally {
			//不要在finally加return 语句
			return 3;
		}
	}

}
