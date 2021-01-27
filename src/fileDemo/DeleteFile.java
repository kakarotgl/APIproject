package fileDemo;

import java.io.File;

public class DeleteFile {
	/*
	 * delete():删除空目录(没有子目录或者子文件)或者文件
	 * 
	 * listFiles():展开当前目录的所有子目录并保存在File数组里;
	 * 
	 * 利用"递归"方法实现删除有内容的文件夹
	 * 递归:一个方法在执行期间,直接或间接调用了当前方法自身的现象,称为"递归"
	 */

	public static void main(String[] args) {
		/*File dir=new File("D:/top.jpg");
		System.out.println(dir.delete());*/
		
		//
		
		/*File dir=new File("D:/BirdGame");
		File[] files=dir.listFiles();
		for(File file:files) {//可以替换下面两行代码:for each,增强for循环
		//for(int i=0;i<files.length;i++) {
			//File file=files[i];
			System.out.println(file);
		}*/
		
	}

}
