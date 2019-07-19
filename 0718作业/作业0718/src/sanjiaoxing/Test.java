package sanjiaoxing;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sanjiaoxing a=new sanjiaoxing();
		String answer;
		do{
			System.out.println("请输入第1条边");
			a.b1=sc.nextInt();
			System.out.println("请输入第2条边");
			a.b2=sc.nextInt();
			System.out.println("请输入第3条边");
			a.b3=sc.nextInt();
		if(a.isTriangle()){
			System.out.println(a.leixing());
		}else{
			System.out.println("这不是三角形");
		}
		System.out.println("继续吗？(y/s)");
		 answer=sc.next();
		}while("y".equals(answer));
		
	}

}
