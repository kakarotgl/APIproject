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
			System.out.println("��ָ���쳣");
			return 1;
		}catch(Exception e) {
			System.out.println("�����������쳣");
			return 2;
		}finally {
			//��Ҫ��finally��return ���
			return 3;
		}
	}

}
