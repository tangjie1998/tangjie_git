package bank;

class Bank {//�����̴�
	 int year;//��������
	 long money;//������
        double YueGong(){
    	if(year==3){
    		return money*1.0603/36;
    	}else if(year==5){
    		return money*1.0612/60;
    	}else{
    		return money*1.0639/240;
    	}
     }
       double Sumlixi(){
    	   return YueGong()*year*12-money;
       }
	
	

}
