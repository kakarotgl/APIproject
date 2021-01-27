package readWrite;
/*
 * 用于封装用户信息的存储功能
 */

import java.io.RandomAccessFile;
import java.util.Arrays;

public class UserDao {
	private String file="user.dat";
	private RandomAccessFile raf;
	public void open() throws Exception{
		raf=new RandomAccessFile(file,"rw");
	}
	
	//增加用户信息
	public void add(String name,
			String password,int age,
			String mobile,String email) throws Exception{
		//跳到文件末尾
		raf.seek(raf.length());
		long p=raf.getFilePointer();
		System.out.println(p);
		int id=nextValue();//以后生成连续ID;
		raf.writeInt(id);//写出id占用4个字节
		//检查是否写出了4个字节
		long n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//写人名到文件中30个bytes
		byte[] bytes=name.getBytes("UTF-8");
		bytes=Arrays.copyOf(bytes,30);
		raf.write(bytes);
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//写密码:
		bytes=password.getBytes("UTF-8");
		bytes=Arrays.copyOf(bytes,16);
		raf.write(bytes);;
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//年龄
		raf.writeInt(age);
		n=raf.getFilePointer()-p;
		System.out.println(n);
		
		//电话
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
	
	private int nextValue() throws Exception{//用文件存取来读取下一个数字
		String file="seed.txt";
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		byte[] bytes=new byte[(int)raf.length()];//文件多大就读取多大(按文本读)
		raf.read(bytes);
		String str=new String(bytes,"UTF-8");//用utf-8解码读取信息
		int n=0;
		if(!str.isEmpty()) {
			n=Integer.parseInt(str);
		}
		n++;
	    raf.seek(0);
	    raf.write(Integer.toString(n).getBytes("UTF-8"));//编成utf-8编码存进文件里面
		return n;
	}

	
	//获取用户信息
	public User get(int row) throws Exception{
		int start=row*120;
		System.out.println(start);
		//如果超过文件范围,则返回null;
		if(start>=raf.length()) {
			return null;
		}
		raf.seek(start);
		int id=raf.readInt();
		System.out.println(id);
		
		//读取name
		byte[] bytes=new byte[30];
		raf.read(bytes);
		String name=new String(bytes,"UTF-8").trim();
		System.out.println(name);
		
		//读取password
		bytes=new byte[16];
		raf.read(bytes);
		String password=new String (bytes,"UTF-8").trim();
		System.out.println(password);
		
		//读取age
		int age=raf.readInt();
		System.out.println(age);
		
		//读取mobile
		bytes=new byte[16];
		raf.read(bytes);
		String mobile=new String(bytes,"UTF-8").trim();
		System.out.println(mobile);
		
		//读取email
		bytes=new byte[50];
		raf.read(bytes);
		String email=new String(bytes,"UTF-8").trim();
		System.out.println(email);
		
		User user=new User(id,name,password,age,mobile,email);
		return user;
	}

}
