package sanjiaoxing;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sanjiaoxing a=new sanjiaoxing();
		String answer;
		do{
			System.out.println("�������1����");
			a.b1=sc.nextInt();
			System.out.println("�������2����");
			a.b2=sc.nextInt();
			System.out.println("�������3����");
			a.b3=sc.nextInt();
		if(a.isTriangle()){
			System.out.println(a.leixing());
		}else{
			System.out.println("�ⲻ��������");
		}
		System.out.println("������(y/s)");
		 answer=sc.next();
		}while("y".equals(answer));
		
	}

}
