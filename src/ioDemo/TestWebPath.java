package ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class TestWebPath {
	//���´����Ƿ���web��Ŀ���в���
	/*
	System.out.println(this.getClass());//��ȡ��ǰ����ʱ��
	System.out.println(this.getClass().getResource(""));//��ǰ��·��,�õ����ǵ�ǰ��class�ļ���URIĿ¼���������Լ�
	System.out.println(this.getClass().getResource("/"));//��ǰ��·��,�õ����ǵ�ǰ��classpath�ľ���URI·��
	InputStream ins=this.getClass().getResourceAsStream("test.txt");//��ȡ�ļ���
	byte[] bt=new byte[1024];
	int len;
	while((len=ins.read(bt))!= -1){
		System.out.println(new String(Arrays.copyOf(bt, len),"UTF-8"));//ת��Ϊ�ַ���
	}
	ins.close();*/
	
	//ʹ��spring�������ȡjar�����ļ�·������tomcat������jar����
	/**
	 * jar�����ļ���ȡ��ʽ��ClassPathResource classPathResource = new ClassPathResource("test.txt");
	 * 
	 * ��ȡ�ļ���classPathResource.getFile();
	 * ��ȡ�ļ�����classPathResource.getInputStream();
	 */
	
	
	//ͨ��url+�ļ�����ȡ�ı�����
	/**
	String filePaht3=this.getClass().getResource("")+"test.txt";
	System.out.println(filePaht3);
	System.out.println(filePaht3.replace("file:/", ""));
	File file3 = new File(filePaht3.replace("file:/", ""));
      InputStream in=new FileInputStream(file3);
     byte[] b=new byte[(int) file3.length()];  //�����ļ��Ĵ�С�������ֽ�����Ĵ�С
     int len=in.read(b);
     in.close();
     System.out.println(new String(b,0,len));*/
	
	
}
