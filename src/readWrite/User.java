package readWrite;

import java.io.Serializable;
/*
 * 
 */

public class User implements Serializable{
	/**
	 * ���л��汾������
	 */
	private static final long serialVersionUID = -8400445949618716238L;
	private int id;
	private String name;
	//˲̬transient����:����ӵ��ļ�����
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
