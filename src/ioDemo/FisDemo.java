package ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class FisDemo {
	/*
	 * �ļ�������������ʾ
	 * 
	 * �ļ���������һ���ڵ���,�����ӵ��ļ�����Դ,
	 * ����ֻ�ṩ�˻������ֽڶ�ȡ����,ÿ�ο��Զ�ȡһ���ֽڵ��ļ���
	 */

	public static void main(String[] args) throws Exception{
		String file="fos.txt";
		System.out.println(new File(file).getAbsolutePath());//��ȡ����·��
		FileInputStream fis=
				new FileInputStream(file);
		//�ļ��������ṩ�Ļ������ֽڶ�ȡ����
		int b=fis.read();
		System.out.println(Integer.toBinaryString(b));
		
		b=fis.read();
		System.out.println(Integer.toBinaryString(b));
		fis.close();

	}

}
