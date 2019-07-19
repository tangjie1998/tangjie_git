package bank;

class Bank {//购房商贷
	 int year;//贷款年限
	 long money;//贷款金额
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
