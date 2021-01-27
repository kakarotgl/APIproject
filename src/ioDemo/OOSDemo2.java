package ioDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import readWrite.User;

public class OOSDemo2 {
	/*
	 * 对象输出流
	 * frush();:将所有流中缓存的数据及时写到文件中
	 * 然后关闭文件,关闭后不能再写数据
	 */

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("obj.dat");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		ObjectOutputStream out=new ObjectOutputStream(bos);
		
		
		
		User user=new User(1,"范传奇","123",28,"110","fancq@tedu.cn");
		out.writeObject(user);
		
		User user2=new User(2,"王克晶","456",22,"120","wangkj@tedu.cn");
		out.writeObject(user2);
			
		out.close();
		System.out.println("ok");

	}

}
