package fileDemo;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
	/*
	 * createNewFile();�����ļ�
	 */

	public static void main(String[] args) throws Exception {
		File dir=new File("D:\\Qiju_Li");
		if(!dir.exists()){//����ļ��в�����
			dir.mkdir();//�����ļ���
		}
		
		File file=new File("D:\\abc.txt");
		boolean b=file.exists();
		System.out.println(b);
		boolean b2=file.createNewFile();
		System.out.println(b2);
		b=file.exists();
		System.out.println(b);
	}

}
