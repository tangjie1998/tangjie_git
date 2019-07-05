package chihuolianmeng;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 吃货联盟订单系统
 */
public class OrderingMgr3 {
	public static void main(String[] args) {
		
		//定义菜品数组，及数据
		String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令鲜蔬" }; // 菜品名称
		double[] prices = new double[] { 38.0, 20.0, 10.0 }; // 菜品单价
		int[] praiseNums = new int[3]; //点赞数，默认点赞数0

		//定义订单数组，用户最多4条订单
		String[] names = new String[4]; // 订餐人名称
		String[] dishMegs = new String[4]; // 所选菜品,包括菜品名及份数
		int[] times = new int[4]; // 送餐日期
		String[] addresses = new String[4]; // 送餐地址
		int[] states = new int[4]; // 订单状态： 0：已预定 1：已完成
		double[] sumPrices = new double[4]; // 总金额

		
		
		Scanner input=new Scanner(System.in);
		int num=-1; //用户输入0返回主菜单，否则退出系统
		boolean isExit=false;//标识用户是否退出系统，true退出系统
		
		//循环，显示系统菜单。用户根据输入的数字执行相应的功能
		do {
			System.out.println("***********************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("***********************");
			
			System.out.print("请选择:");
			int choose=input.nextInt();//记录用户选择的编号
			
			/*
			 * 根据用户输入功能编号，执行相应的功能
			 * 
			 */
			switch(choose) {
			    case 1:
			    	//我要订餐
			    	System.out.println("****我要订餐***");
			        boolean isAdd =false;//标识是否可以订餐，即订餐数组是否已经满
			     //多次订餐，需校验订餐是否已满
			        
			    for(int j=0;j<names.length;j++) {
			    	if(names[j]==null) {//找到第一个空位，添加订单信息
			    		isAdd =true;//表示可以下订单
			    		//显示菜品
				    	System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
				    	for(int i=0;i<dishNames.length;i++) {
		
				    		String price=prices[i]+"元";
				    		String praiseNum=(praiseNums[i]>0) ? (praiseNums[i]+"赞") : "0";
				    		System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price
				    				+"\t"+praiseNum);
				    	}
				    	
				    	//用户选择菜品
				    	System.out.print("请输入订餐人姓名:");
				    	String name=input.next();
				    	System.out.print("请选择您需要的菜品编号:");
				    	int chooseDish=input.nextInt();
				    	System.out.print("请选择您需要的份数：");
				    	int number=input.nextInt();
				    	
				    	String dishMeg=dishNames[chooseDish-1]+""+number+"份";
				    	
				    	//订餐金额
				    	double sumPrice=prices[chooseDish-1]*number;
				    	//送餐费：餐费满50元，免送餐费5元
				    	double deliCharge=sumPrice>=50 ? 0 : 5;
				    	
				    	//送餐时间
				    	System.out.println("请输入送餐时间(送餐时间是10点到20点间整点送餐)：");
				    	int time=input.nextInt();
				    	
				    	//时间录入错误，重新录入
				    	while(time<10  || time >20) {
				    		System.out.println("您的输入有误，请输入10~20之间的整数！");
				    		time=input.nextInt();
				    	}
				    	
				    	//送餐地址
				    	System.out.println("请输入送餐地址");
				    	String address=input.next();
				    	
				    	//订单状态：0 ——预定
//				    	states[chooseDish-1]=0;  int类型数组不赋值，默认为0
				    	
				    	//订餐成功，友好的提示下 信息
				    	System.out.println("订餐成功！" );
				    	System.out.println("您的订单是："+dishMeg);
				    	System.out.println("你的送餐时间:"+time+"点");
				    	System.out.println("餐费："+sumPrice+"元， 送餐费："+deliCharge
				    			+ "元，总计:"+(sumPrice+deliCharge)+"元。");
				    	
				    	//将订单信息添加到订单数组系列中
				    	names[j]=name;
						dishMegs[j]=dishMeg;
						times[j]=time;
						addresses[j]=address;
						sumPrices[j]=(sumPrice+deliCharge);
						break;
			    	}
			    	
			    }
			    
			    if(!isAdd) {//isAdd 为false，表示餐袋已满，不能下单
			    	System.out.println("对不起，您的餐袋已满！");
			    }
			        System.out.println(Arrays.toString(names));
			    	break;
			    case 2:
			    	//查看餐袋
			    	System.out.println("***查看餐袋***");
			    	System.out.println("序号\t"+"订餐人\t"+"餐品信息\t\t"+"送餐时间\t"+"送餐地址\t"+"总金额\t"+"订单状态\t");
			    	for (int i = 0; i < names.length; i++) {
			    		if (names[i]!=null) {
						System.out.print((i+1)+"\t");
			    		System.out.print(names[i]+"\t");
			    		System.out.print(dishMegs[i]+"\t");
			    		System.out.print(times[i]+"\t");
			    		System.out.print(addresses[i]+"\t");
			    		System.out.print(sumPrices[i]+"\t");
			    		if (states[i]==0) {
			    			System.out.println("已预订");
						}else{
							System.out.println("已签收");
						}
			    		}
					}
			    	break;
			    case 3:
			    	//签收订单
			    	System.out.println("***签收订单***");
			    	System.out.println("请输入您要签收的订单：");
			    	int qianshounum=input.nextInt();
			    	boolean find=false;
			    	for (int i = 0; i < names.length; i++) {
						if (names[i]!=null&&states[i]==0&&qianshounum==i+1) {
							states[i]=1;
							System.out.println("订单签收成功！");
							find=true;
						}else if ((names[i]!=null)&&(states[i]==1)&&(qianshounum==i+1)){
							System.out.println("您的订单已签收，不能再次签收！");
						}
					}
			    	if (!find) {
						System.out.println("您选择的订单不存在！");
					}
			    	
			    	break;
			    case 4:
			    	//删除订单
			    	System.out.println("***删除订单***");
			    	boolean finda=false;
			    	System.out.println("请输入您要删除的订单号");
			    	int shanchunum=input.nextInt();
			    	for (int i = 0; i < names.length; i++) {
						if (names[i]!=null&&states[i]==1&&shanchunum==i+1) {
							finda=true;
							for (int j = shanchunum-1; j < sumPrices.length-1; j++) {
								names[j]=names[j+1];
								dishMegs[j]=dishMegs[j+1];
								times[j]=times[j+1];
								addresses[j]=addresses[j+1];
								states[j]=states[j+1];
								sumPrices[j]=sumPrices[j+1];
							}
							    int endIndex=names.length-1;
							    names[endIndex]=null;
							    dishMegs[endIndex]=null;
							    times[endIndex]=0;
							    addresses[endIndex]=null;
							    states[endIndex]=0;
							    sumPrices[endIndex]=0;
							System.out.println("订单删除成功！");
							break;
						}else if (names[i]!=null&&states[i]==0&&shanchunum==i+1) {
							System.out.println("您选择的订单未签收，不能删除");
							finda=true;
							break;
						}
					}
			    	     if (!finda) {
							System.out.println("您要删除的订单不纯在！");
						}
			    	break;
			    case 5:
			    	//我要点赞
			    	System.out.println("***我要点赞***");
			    	System.out.println("序号"+"\t"+"菜名"+"\t"+"单价");
			    	for (int i = 0; i < dishNames.length; i++) {
			    		String price=prices[i]+"元";
			    		String praiseNum=(praiseNums[i]>0) ? (praiseNums[i]+"赞") : "0";
			    		System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price
			    				+"\t"+praiseNum);	
					}
			    	System.out.println("请选折您要点赞的序号：");
			    	int priaiseNum=input.nextInt();
			    	praiseNums[priaiseNum-1]++;
			    	System.out.println("点赞成功！");
			    	break;
			    case 6:
			    	//退出系统
//			    	isExit=true;
//			    	break;
			    default://功能编号录入错误，认为退出系统
			    	isExit=true;
			    	 input.close();
			    	break;
			}
			
			
			if(!isExit) {//不退出系统，录入0，可以返回主菜单
				System.out.print("输入0返回主菜单:");
			    num=input.nextInt();
			}else {//结束循环
				break;
			}
			
		}while(num==0);
			
		
		
		
	
	}

}
