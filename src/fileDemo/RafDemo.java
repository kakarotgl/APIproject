package fileDemo;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RafDemo {

	public static void main(String[] args) throws IOException {
		String file="E:/δ����-1.psd";
		RandomAccessFile raf=
				new RandomAccessFile(file,"r");
		//��֤:�ļ��򿪺��ļ�ָ��ָ��0λ��
		long p=raf.getFilePointer();
		System.out.println(p);
		//��ȡ0λ��������,����ֵint,������
		//int�����ĵ�8λλ��
		int a=raf.read();
		//����2�����������,��֤�Ͱ�λ��byte����
		System.out.println(
				Integer.toBinaryString(a));
		
		p=raf.getFilePointer();
		System.out.println(p);
		int b=raf.read();
		System.out.println(Integer.toBinaryString(b));
		raf.close();
		

	}

}
