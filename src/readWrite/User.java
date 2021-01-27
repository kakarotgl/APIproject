package readWrite;

import java.io.Serializable;
/*
 * 
 */

public class User implements Serializable{
	/**
	 * 序列化版本号属性
	 */
	private static final long serialVersionUID = -8400445949618716238L;
	private int id;
	private String name;
	//瞬态transient属性:不想加到文件里面
	private transient String password;
	private int age;
	private String mobile;
	private String email;
	
	public User() {
		
	}
	
	public User(int id, String name, String password, int age, String mobile, String email) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.mobile=mobile;
		this.email=email;
	}
	
	

	@Override
	public String toString() {
		return "User [id="+id+", name=" + name + ", password=" + password + ", age=" + age + ", mobile=" + mobile + ", email="
				+ email + "]";
	}



}
