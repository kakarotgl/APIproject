package readWrite;

import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafWrite2Demo {

	public static void main(String[] args) throws Exception{
		String file="E:/W.P.S.6876.19.552.exe";
		String file2="E:/W.P.S.exe";
		RandomAccessFile raf=new RandomAccessFile(file,"r");
		RandomAccessFile dst=new RandomAccessFile(file2,"rw");
		
		byte[] buf=new byte[1024*8];//���ظ�����,����ȡraf���,�������������һ�α����
		int n;
		while((n=raf.read(buf))!=-1) {//��raf��ȡ����,����ѭ��д��dst(ֻд����Ч������)
			dst.write(buf,0,n);
		}
		System.out.println("OK");
		raf.close();
		dst.close();
	}
	

}
