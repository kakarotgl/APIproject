package readWrite;

public class UserDaotest {
	/*
	 * ����UserDao���û���Ϣ���浽�ļ���
	 */

	public static void main(String[] args) throws Exception{
		UserDao dao=new UserDao();
		//��		
		dao.open();
		//����û���Ϣ
		/*dao.add("������", "110", 20, "119", "fancq@tedu.cn");
		dao.add("���˾�", "120", 22, "112", "wangkj@tedu.cn");*/
		User user;
		user=dao.get(1);
		System.out.println(user);
		
		//�ر�
		dao.close();
		

	}

}
