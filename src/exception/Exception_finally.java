package exception;

public class Exception_finally {
	/*
	 * finally�鱻�������쳣������Ƶ����,��:
	 * ���һ��catch֮��,����ֱ�Ӹ���try֮��.
	 * 
	 * finally�����ȷ��ֻҪ����ִ�е�try���еĴ���
	 * ��ôfinally����Ĵ����һ���ᱻִ��.
	 * ͨ���Ὣ���۳����Ƿ����Ҫ���еĴ������finally����
	 * ȷ��ִ��,����IO�����еĹر���
	 */

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try {
			String str="a";
			System.out.println(str.length());
			return;
		}catch(Exception e) {
			System.out.println("������");
		}finally {//�����Ƿ�ִ����return,finally�еĴ��붼һ����ִ��
			System.out.println("finally�еĴ���ִ����");
		}

	}

}
