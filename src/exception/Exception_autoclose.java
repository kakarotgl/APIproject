package exception;

import java.io.FileOutputStream;

public class Exception_autoclose {
	/*
	 * JDK1.7��������һ���µ�����:
	 * ���쳣���������֧���Զ��رղ���;
	 * ��Ҫ����쳣��������ж�IO����ʱ�ر����ĸ��Ӳ���
	 */

	public static void main(String[] args) {

		try (
		/*
		 * ���ﶨ������ݱ��붼��Closeable������,�����̳�����,
		 * ���Կ��Զ���������,���Ҷ���������������Զ���close
		 * ʵ������������Ǳ���������Ϊ,�������ڽ���ǰԴ��������
		 * class�ļ�ʱ�Ὣ����ı�Ϊ��finally�йر�
		 */
			FileOutputStream fos=new FileOutputStream("fos.txt");
		){
			fos.write(1);
		}catch(Exception e) {
			System.out.println("���,�Ҵ���");
		}

	}

}
