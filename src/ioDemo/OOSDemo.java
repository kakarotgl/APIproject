package ioDemo;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import readWrite.User;

public class OOSDemo {
	/*
	 * 对象输入流
	 */

	public static void main(String[] args) throws Exception{
		
		
		FileInputStream fis=new FileInputStream("obj.dat");
		BufferedInputStream bis=new BufferedInputStream(fis);
		ObjectInputStream in=new ObjectInputStream(bis);

		
		Object obj=in.readObject();
		User user=(User)obj;
		System.out.println(user);
		
		obj=in.readObject();
		user=(User)obj;
		System.out.println(user);
		
		in.close();

	}

}
