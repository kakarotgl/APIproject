package readWrite;

import java.io.RandomAccessFile;

public class RafWriteDemo {
	/*
	 * ��д�ļ�;����д�ļ��Զ����ӳ���
	 * write();
	 * "rw"ģʽʱ��,����ļ����������Զ������ļ�
	 */

	public static void main(String[] args) throws Exception {
		String file="demo.txt";
		//"rw"ģʽʱ��,����ļ����������Զ������ļ�
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		long p=raf.getFilePointer();
		System.out.println(p);
		
		raf.write(0xe4);
		p=raf.getFilePointer();
		System.out.println(p);//1
		
		raf.write(0xb8);
		p=raf.getFilePointer();
		System.out.println(p);	//2	
		
		raf.write(0xad);
		p=raf.getFilePointer();
		System.out.println(p);//3
		
		raf.write(0x42);//�����޸�
		p=raf.getFilePointer();
		System.out.println(p);
		
		raf.close();

	}

}
