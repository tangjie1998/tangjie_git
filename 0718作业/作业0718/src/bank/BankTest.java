package bank;

import java.util.Scanner;

class BankTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入贷款金额：");
	    Bank a=new Bank();
	    a.money=sc.nextLong();
	    System.out.println("请选择贷款年限：1(3年) 2(5年) 3(20年)");
	    a.year=sc.nextInt();
	    if (a.year==1) {
			a.year=3;
		}else if (a.year==2) {
			a.year=5;
		}else if (a.year==3) {
			a.year=20;
		}
	    System.out.println("月供为："+a.YueGong()+"\n"+"总利息为："+a.Sumlixi());
	    
}
}
