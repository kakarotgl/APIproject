package readWrite;

import java.io.RandomAccessFile;

public class RafDemo {

	public static void main(String[] args) throws Exception {
		//����·��:
		String file="E:\\Users\\uid\\eclipse-workspace\\APIproject\\src\\selday04\\demo.txt";
		
		//���·��:�����java������·��
		//Eclipse���ǵ�ǰ��Ŀ���ļ���
		String file1="src/selday04/demo.txt";
		/*
		 * ���Զ�ȡ���ļ�ĩβʱ�򷵻�-1;
		 */
		RandomAccessFile raf=
				new RandomAccessFile(file1,"r");
		int b;
		while((b=raf.read())!=-1){
			System.out.println(Integer.toBinaryString(b));//-1��ʾ��ͷ��
		}
		raf.close();

	}

}
