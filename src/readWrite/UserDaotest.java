package readWrite;

public class UserDaotest {
	/*
	 * 测试UserDao将用户信息保存到文件中
	 */

	public static void main(String[] args) throws Exception{
		UserDao dao=new UserDao();
		//打开		
		dao.open();
		//添加用户信息
		/*dao.add("范传奇", "110", 20, "119", "fancq@tedu.cn");
		dao.add("王克晶", "120", 22, "112", "wangkj@tedu.cn");*/
		User user;
		user=dao.get(1);
		System.out.println(user);
		
		//关闭
		dao.close();
		

	}

}
