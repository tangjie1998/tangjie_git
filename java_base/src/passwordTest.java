import java.util.Scanner;


public class passwordTest {
public static void main(String[] args) {
	System.out.println("�������û�����");
	Scanner sc=new Scanner(System.in);
	password a=new password();
	a.user=sc.next();
	System.out.println("���������룺");
	a.password=sc.nextInt();
	if (a.user.equals("admin1")&&a.password==111111) {
		System.out.println("�����������룺");
		a.newpassword=sc.nextInt();
		a.rightshow(a.newpassword);
	}else{
		a.errorshow();
	}
	
	
	
	
}
}
