package fileDemo;
import java.io.File;

public class FileDemo {
	/*
	 * mkdirs();�����ļ���(Ŀ¼)
	 * exists();�����ļ���(�ļ�)�Ƿ����
	 * new File()���ᴴ���ļ�!ֻ�����ڴ��д���һ��File����,��������Ӧ��
	 * �ļ���.�ļ��Ƿ������exists()���
	 */

	public static void main(String[] args) {
		/*
		 * ����File API����һ���ļ���
		 */
		File dir=new File("D:/demo");
		boolean b=dir.mkdir();
		System.out.println(b);
		//true �ɹ�,����false,�������Ѿ����ڻ���û��Ȩ��;
		System.out.println(dir.exists());
		
		File dir2=new File("D:/dir2");
		System.out.println(dir2.exists());
		dir2.mkdir();
		System.out.println(dir2.exists());

	}

}
