package ioDemo;

import java.io.FileOutputStream;

public class FosDemo {
	/*
	 * �ļ����������ʾ
	 * �ļ��������һ���ڵ���
	 * �ڵ���:�����ӵ�����Դ�Ļ�����,ֻ����
	 * ���Ļ�������,ÿ��дbyte���ļ���
	 */

	public static void main(String[] args) throws Exception{
		String file="fos.txt";
		FileOutputStream fos=
				new FileOutputStream(file);
		//������д�������ֽ�����
		fos.write(0x41);
		fos.write(0x42);
		//��ʹ�ú���عر�!
		fos.close();
		System.out.println("OK");

	}

}
