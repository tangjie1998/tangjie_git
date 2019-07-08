import java.util.Scanner;


public class passwordTest {
public static void main(String[] args) {
	System.out.println("请输入用户名：");
	Scanner sc=new Scanner(System.in);
	password a=new password();
	a.user=sc.next();
	System.out.println("请输入密码：");
	a.password=sc.nextInt();
	if (a.user.equals("admin1")&&a.password==111111) {
		System.out.println("请输入新密码：");
		a.newpassword=sc.nextInt();
		a.rightshow(a.newpassword);
	}else{
		a.errorshow();
	}
	
	
	
	
}
}
