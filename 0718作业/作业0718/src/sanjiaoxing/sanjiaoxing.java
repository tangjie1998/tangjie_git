package sanjiaoxing;

public class sanjiaoxing {
	int b1;
	int b2;
	int b3;
	boolean isTriangle(){//判断是否为三角形
		boolean flag=false;
		if(b1+b2>b3&&b1+b3>b2&&b2+b3>b1){
			flag=true;
		}
		return flag;
	}
	String leixing(){//判断为什么三角形
			if(b1*b1+b2*b2==b3*b3||b1*b1==b2*b2+b3*b3||b1*b1+b3*b3==b2*b2){
				return "这是一个直角三角形";
			}else if(b1*b1+b2*b2<b3*b3||b1*b1>b2*b2+b3*b3||b1*b1+b3*b3<b2*b2){
				return "这是一个钝角三角形";
			}else{
				return "这是一个锐角三角形";
			}
			
		}
		
	
	}
	


