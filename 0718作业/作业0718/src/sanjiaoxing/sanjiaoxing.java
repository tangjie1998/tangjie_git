package sanjiaoxing;

public class sanjiaoxing {
	int b1;
	int b2;
	int b3;
	boolean isTriangle(){//�ж��Ƿ�Ϊ������
		boolean flag=false;
		if(b1+b2>b3&&b1+b3>b2&&b2+b3>b1){
			flag=true;
		}
		return flag;
	}
	String leixing(){//�ж�Ϊʲô������
			if(b1*b1+b2*b2==b3*b3||b1*b1==b2*b2+b3*b3||b1*b1+b3*b3==b2*b2){
				return "����һ��ֱ��������";
			}else if(b1*b1+b2*b2<b3*b3||b1*b1>b2*b2+b3*b3||b1*b1+b3*b3<b2*b2){
				return "����һ���۽�������";
			}else{
				return "����һ�����������";
			}
			
		}
		
	
	}
	


