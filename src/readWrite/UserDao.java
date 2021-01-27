package readWrite;
/*
 * ���ڷ�װ�û���Ϣ�Ĵ洢����
 */

import java.io.RandomAccessFile;
import java.util.Arrays;

public class UserDao {
	private String file="user.dat";
	private RandomAccessFile raf;
	public void open() throws Exception{
		raf=new RandomAccessFile(file,"rw");
	}
	
	//�����û���Ϣ
	public void add(String name,
			String password,int age,
			String mobile,String email) throws Exception{
		//�����ļ�ĩβ
		raf.seek(raf.length());
		long p=raf.getFilePointer();
		System.out.println(p);
		int id=nextValue();//�Ժ���������ID;
		raf.writeInt(id);//д��idռ��4���ֽ�
		//����Ƿ�д����4���ֽ�
		long n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//д�������ļ���30��bytes
		byte[] bytes=name.getBytes("UTF-8");
		bytes=Arrays.copyOf(bytes,30);
		raf.write(bytes);
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//д����:
		bytes=password.getBytes("UTF-8");
		bytes=Arrays.copyOf(bytes,16);
		raf.write(bytes);;
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//����
		raf.writeInt(age);
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//�绰
		bytes=mobile.getBytes("UTF-8");
		bytes=Arrays.copyOf(bytes,16);
		raf.write(bytes);;
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//email
		bytes=email.getBytes();
		bytes=Arrays.copyOf(bytes, 50);
		raf.write(bytes);
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		
		
	}
	
	public void close() throws Exception{
		raf.close();
	}
	
	private int nextValue() throws Exception{//���ļ���ȡ����ȡ��һ������
		String file="seed.txt";
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		byte[] bytes=new byte[(int)raf.length()];//�ļ����Ͷ�ȡ���(���ı���)
		raf.read(bytes);
		String str=new String(bytes,"UTF-8");//��utf-8�����ȡ��Ϣ
		int n=0;
		if(!str.isEmpty()) {
			n=Integer.parseInt(str);
		}
		n++;
	    raf.seek(0);
	    raf.write(Integer.toString(n).getBytes("UTF-8"));//���utf-8�������ļ�����
		return n;
	}

	
	//��ȡ�û���Ϣ
	public User get(int row) throws Exception{
		int start=row*120;
		System.out.println(start);
		//��������ļ���Χ,�򷵻�null;
		if(start>=raf.length()) {
			return null;
		}
		raf.seek(start);
		int id=raf.readInt();
		System.out.println(id);
		
		//��ȡname
		byte[] bytes=new byte[30];
		raf.read(bytes);
		String name=new String(bytes,"UTF-8").trim();
		System.out.println(name);
		
		//��ȡpassword
		bytes=new byte[16];
		raf.read(bytes);
		String password=new String (bytes,"UTF-8").trim();
		System.out.println(password);
		
		//��ȡage
		int age=raf.readInt();
		System.out.println(age);
		
		//��ȡmobile
		bytes=new byte[16];
		raf.read(bytes);
		String mobile=new String(bytes,"UTF-8").trim();
		System.out.println(mobile);
		
		//��ȡemail
		bytes=new byte[50];
		raf.read(bytes);
		String email=new String(bytes,"UTF-8").trim();
		System.out.println(email);
		
		User user=new User(id,name,password,age,mobile,email);
		return user;
	}

}
