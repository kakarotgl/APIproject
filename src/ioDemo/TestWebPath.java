package ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class TestWebPath {
	//以下代码是放在web项目进行测试
	/*
	System.out.println(this.getClass());//获取当前运行时类
	System.out.println(this.getClass().getResource(""));//当前包路径,得到的是当前类class文件的URI目录。不包括自己
	System.out.println(this.getClass().getResource("/"));//当前类路径,得到的是当前的classpath的绝对URI路径
	InputStream ins=this.getClass().getResourceAsStream("test.txt");//获取文件流
	byte[] bt=new byte[1024];
	int len;
	while((len=ins.read(bt))!= -1){
		System.out.println(new String(Arrays.copyOf(bt, len),"UTF-8"));//转换为字符串
	}
	ins.close();*/
	
	//使用spring工具类读取jar包内文件路径（在tomcat内启动jar包）
	/**
	 * jar里面文件读取方式：ClassPathResource classPathResource = new ClassPathResource("test.txt");
	 * 
	 * 获取文件：classPathResource.getFile();
	 * 获取文件流：classPathResource.getInputStream();
	 */
	
	
	//通过url+文件名读取文本内容
	/**
	String filePaht3=this.getClass().getResource("")+"test.txt";
	System.out.println(filePaht3);
	System.out.println(filePaht3.replace("file:/", ""));
	File file3 = new File(filePaht3.replace("file:/", ""));
      InputStream in=new FileInputStream(file3);
     byte[] b=new byte[(int) file3.length()];  //根据文件的大小来定义字节数组的大小
     int len=in.read(b);
     in.close();
     System.out.println(new String(b,0,len));*/
	
	
}
