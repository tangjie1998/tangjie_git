package bank;

import java.util.Scanner;

class BankTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
	    Bank a=new Bank();
	    a.money=sc.nextLong();
	    System.out.println("��ѡ��������ޣ�1(3��) 2(5��) 3(20��)");
	    a.year=sc.nextInt();
	    if (a.year==1) {
			a.year=3;
		}else if (a.year==2) {
			a.year=5;
		}else if (a.year==3) {
			a.year=20;
		}
	    System.out.println("�¹�Ϊ��"+a.YueGong()+"\n"+"����ϢΪ��"+a.Sumlixi());
	    
}
}
