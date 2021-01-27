package readWrite;

import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafWrite2Demo {

	public static void main(String[] args) throws Exception{
		String file="E:/W.P.S.6876.19.552.exe";
		String file2="E:/W.P.S.exe";
		RandomAccessFile raf=new RandomAccessFile(file,"r");
		RandomAccessFile dst=new RandomAccessFile(file2,"rw");
		
		byte[] buf=new byte[1024*8];//会重复覆盖,当读取raf完毕,后面的数据是上一次保存的
		int n;
		while((n=raf.read(buf))!=-1) {//当raf读取结束,则不再循环写入dst(只写入有效的数据)
			dst.write(buf,0,n);
		}
		System.out.println("OK");
		raf.close();
		dst.close();
	}
	

}
