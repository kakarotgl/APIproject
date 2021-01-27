package ioDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {

	public static void main(String[] args) throws Exception{
		String src="E:/W.P.S.exe";
		String dst="E:/wps2.exe";
		
		FileInputStream fis=new FileInputStream(src);
		BufferedInputStream in=new BufferedInputStream(fis);
		/*
		 * ��BIS����FIS��ǰ��,Ϊ�ļ������
		 * ��չ�����ȡ����,����BIS�ķ���,��
		 * ����ʹ�õ�BIS�ṩ�Ļ����ȡ����
		 */
		
		
		FileOutputStream fos=new FileOutputStream(dst);
		BufferedOutputStream out=new BufferedOutputStream(fos);
		/*
		 * �����������BOS����FOS��ǰ��,Ϊ�ļ�
		 * �����չ���幦��,���IO����,ֻҪ����
		 * BOS�ķ����Ϳ���ʹ��������幦��
		 */
		
		int n;
		while((n=in.read())!=-1) {
			out.write(n);
		}
		
		in.close();
		out.close();
		System.out.println("OK");

	}

}
