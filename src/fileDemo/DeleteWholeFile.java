package fileDemo;

import java.io.File;

public class DeleteWholeFile {
	/*
	 * ����"�ݹ�"����ʵ��ɾ�������ݵ��ļ���
	 * �ݹ�:һ��������ִ���ڼ�,ֱ�ӻ��ӵ����˵�ǰ�������������,��Ϊ"�ݹ�"
	 * 
	 * ɾ���ļ���(dir){
	 * �г��ļ�������
	 * ��һɾ��
	 *    ������ļ�,��ɾ��
	 *    ������ļ���,ɾ���ļ���
	 * ɾ����ǰ�ļ���
	 * }
	 */

	public static void main(String[] args) {
		File dir=new File("F:/hello");
		delete(dir);
	}
	
	public static void delete(File dir) {
		File[] files=dir.listFiles();
		if(files!=null) {
			for(File file:files) {
				//ֱ��ɾ���ļ�
				if(file.isFile()) {//������ļ�,ֱ��ɾ��
					file.delete();
				System.out.println(file.getName());
				}else if(file.isDirectory()) {//������ļ���
					delete(file);
				}
			}
		}
	   dir.delete();//ɾ�����ļ���
	}

}
