package ioDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import readWrite.User;

public class OOSDemo2 {
	/*
	 * ���������
	 * frush();:���������л�������ݼ�ʱд���ļ���
	 * Ȼ��ر��ļ�,�رպ�����д����
	 */

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("obj.dat");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		ObjectOutputStream out=new ObjectOutputStream(bos);
		
		
		
		User user=new User(1,"������","123",28,"110","fancq@tedu.cn");
		out.writeObject(user);
		
		User user2=new User(2,"���˾�","456",22,"120","wangkj@tedu.cn");
		out.writeObject(user2);
			
		out.close();
		System.out.println("ok");

	}

}
