package fileDemo;

import java.io.File;

public class FileMkdirs {
	/*
	 * ����ϵ���ļ���
	 * mkdirs();
	 */

	public static void main(String[] args) {
		/*File file=new File("D:/demo");
		File dirs=new File(file,"a/b/c/d");
		System.out.println(dirs.mkdirs());*/
		
		File dir=new File("D:/ɵ���.rar");
		long l=dir.length();
		System.out.println("�ڴ��СΪ:"+l+"�ֽ�");
		double k=l/1024.0;
		double m=l/1024.0/1024;
		double g=l/1024.0/1024/1024;
		System.out.println(k+"kb");
		System.out.println(m+"M");
		System.out.println(g+"G");

	}

}
