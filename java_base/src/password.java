
public class password {
//	6、有一个用户名为admin1,密码111111.
//	模拟实现用户密码管理：
//	输入旧的用户名和密码，如果正确，方有权限更新；从键盘获取新的密码，进行更新
	String user;
	int password;
	int newpassword;
	public void rightshow(int newpassword){
		System.out.println("修改密码成功，您的新密码为："+newpassword);
	}
    public void errorshow(){
		System.out.println("用户名和密码不匹配，您没有权限更新信息");
	}
	
	
}
