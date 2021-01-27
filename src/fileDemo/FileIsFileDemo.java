package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileIsFileDemo {
	/*
	 * isDerectory():���Լ���Ƿ����ļ���(Ŀ¼)
	 * isFile():���Լ���Ƿ����ĵ�;
	 */

	public static void main(String[] args) throws Exception {
		File file=new File("D:/isfile.txt");
		
		System.out.println(file.exists());//false
		System.out.println(file.mkdir());//true
		
		System.out.println(file.isDirectory());//true
		System.out.println(file.isFile());//false
		
		File file2=new File("D:/isfile2.txt");
		System.out.println(file2.exists());//false
		System.out.println(file2.createNewFile());//true
		
		System.out.println(file2.isDirectory());//false
		System.out.println(file2.isFile());//true
		
		
		

	}

}
