package exception;

public class Exception_try_catch {
	/*
	 * �쳣�������:try-catch
	 * ��ʽ:
	 * try{
	 * ���ܻ����Ĵ���Ƭ��
	 * }catch(xxxException e){//ָ��Ҫ������쳣����
	 *         ����try���б������xxxException ��Ľ���ֶ�
	 *  }
	 * ��Ҫע��,try�鲻�ܵ�������,��������catch��
	 * ����finally��.
	 */

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try {
			String str=null;
			System.out.println("����һ᲻�ᱻ���? ��");//��
		    System.out.println(str.length());
		    //try������г��������������ݶ�����ִ��
		    System.out.println("���ٲ��һ᲻�ᱻ���? ����");//����
		}catch(NullPointerException e) {//��ע�����ִ���
			System.out.println("�����˿�ָ��");
		}
		
		
		System.out.println("���������");

	}

}
