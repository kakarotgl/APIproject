package exception;

public class Exception2 {

	public static void main(String[] args) {
System.out.println("����ʼ��");
		
		try {
			String str="a";
			System.out.println("����һ᲻�ᱻ���? ��");//��
		    System.out.println(str.length());
		    System.out.println(str.charAt(0));
		    System.out.println(Integer.parseInt(str));
		    
		    //��try������г��������������ݶ�����ִ��
		    System.out.println("���ٲ��һ᲻�ᱻ���? (��)��");
		}catch(NullPointerException e) {//��ע�����ִ���
			System.out.println("�����˿�ָ��");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("�±�Խ����");
			/*
			 * Ӧ����һ����ϰ��,�����һ��catchȥ����
			 * Exception ,����������Ϊһ��δ֪�Ĵ����³����ж�;
			 */
		}catch(Exception e) {//���֪�������ִ���
			System.out.println("�����Ҿ��ǳ��˸���");
		}
		
		
		System.out.println("���������");


	}

}
