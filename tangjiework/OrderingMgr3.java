package chihuolianmeng;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �Ի����˶���ϵͳ
 */
public class OrderingMgr3 {
	public static void main(String[] args) {
		
		//�����Ʒ���飬������
		String[] dishNames = { "���մ���", "������˿", "ʱ������" }; // ��Ʒ����
		double[] prices = new double[] { 38.0, 20.0, 10.0 }; // ��Ʒ����
		int[] praiseNums = new int[3]; //��������Ĭ�ϵ�����0

		//���嶩�����飬�û����4������
		String[] names = new String[4]; // ����������
		String[] dishMegs = new String[4]; // ��ѡ��Ʒ,������Ʒ��������
		int[] times = new int[4]; // �Ͳ�����
		String[] addresses = new String[4]; // �Ͳ͵�ַ
		int[] states = new int[4]; // ����״̬�� 0����Ԥ�� 1�������
		double[] sumPrices = new double[4]; // �ܽ��

		
		
		Scanner input=new Scanner(System.in);
		int num=-1; //�û�����0�������˵��������˳�ϵͳ
		boolean isExit=false;//��ʶ�û��Ƿ��˳�ϵͳ��true�˳�ϵͳ
		
		//ѭ������ʾϵͳ�˵����û��������������ִ����Ӧ�Ĺ���
		do {
			System.out.println("***********************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("***********************");
			
			System.out.print("��ѡ��:");
			int choose=input.nextInt();//��¼�û�ѡ��ı��
			
			/*
			 * �����û����빦�ܱ�ţ�ִ����Ӧ�Ĺ���
			 * 
			 */
			switch(choose) {
			    case 1:
			    	//��Ҫ����
			    	System.out.println("****��Ҫ����***");
			        boolean isAdd =false;//��ʶ�Ƿ���Զ��ͣ������������Ƿ��Ѿ���
			     //��ζ��ͣ���У�鶩���Ƿ�����
			        
			    for(int j=0;j<names.length;j++) {
			    	if(names[j]==null) {//�ҵ���һ����λ����Ӷ�����Ϣ
			    		isAdd =true;//��ʾ�����¶���
			    		//��ʾ��Ʒ
				    	System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
				    	for(int i=0;i<dishNames.length;i++) {
		
				    		String price=prices[i]+"Ԫ";
				    		String praiseNum=(praiseNums[i]>0) ? (praiseNums[i]+"��") : "0";
				    		System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price
				    				+"\t"+praiseNum);
				    	}
				    	
				    	//�û�ѡ���Ʒ
				    	System.out.print("�����붩��������:");
				    	String name=input.next();
				    	System.out.print("��ѡ������Ҫ�Ĳ�Ʒ���:");
				    	int chooseDish=input.nextInt();
				    	System.out.print("��ѡ������Ҫ�ķ�����");
				    	int number=input.nextInt();
				    	
				    	String dishMeg=dishNames[chooseDish-1]+""+number+"��";
				    	
				    	//���ͽ��
				    	double sumPrice=prices[chooseDish-1]*number;
				    	//�Ͳͷѣ��ͷ���50Ԫ�����Ͳͷ�5Ԫ
				    	double deliCharge=sumPrice>=50 ? 0 : 5;
				    	
				    	//�Ͳ�ʱ��
				    	System.out.println("�������Ͳ�ʱ��(�Ͳ�ʱ����10�㵽20��������Ͳ�)��");
				    	int time=input.nextInt();
				    	
				    	//ʱ��¼���������¼��
				    	while(time<10  || time >20) {
				    		System.out.println("������������������10~20֮���������");
				    		time=input.nextInt();
				    	}
				    	
				    	//�Ͳ͵�ַ
				    	System.out.println("�������Ͳ͵�ַ");
				    	String address=input.next();
				    	
				    	//����״̬��0 ����Ԥ��
//				    	states[chooseDish-1]=0;  int�������鲻��ֵ��Ĭ��Ϊ0
				    	
				    	//���ͳɹ����Ѻõ���ʾ�� ��Ϣ
				    	System.out.println("���ͳɹ���" );
				    	System.out.println("���Ķ����ǣ�"+dishMeg);
				    	System.out.println("����Ͳ�ʱ��:"+time+"��");
				    	System.out.println("�ͷѣ�"+sumPrice+"Ԫ�� �Ͳͷѣ�"+deliCharge
				    			+ "Ԫ���ܼ�:"+(sumPrice+deliCharge)+"Ԫ��");
				    	
				    	//��������Ϣ��ӵ���������ϵ����
				    	names[j]=name;
						dishMegs[j]=dishMeg;
						times[j]=time;
						addresses[j]=address;
						sumPrices[j]=(sumPrice+deliCharge);
						break;
			    	}
			    	
			    }
			    
			    if(!isAdd) {//isAdd Ϊfalse����ʾ�ʹ������������µ�
			    	System.out.println("�Բ������Ĳʹ�������");
			    }
			        System.out.println(Arrays.toString(names));
			    	break;
			    case 2:
			    	//�鿴�ʹ�
			    	System.out.println("***�鿴�ʹ�***");
			    	System.out.println("���\t"+"������\t"+"��Ʒ��Ϣ\t\t"+"�Ͳ�ʱ��\t"+"�Ͳ͵�ַ\t"+"�ܽ��\t"+"����״̬\t");
			    	for (int i = 0; i < names.length; i++) {
			    		if (names[i]!=null) {
						System.out.print((i+1)+"\t");
			    		System.out.print(names[i]+"\t");
			    		System.out.print(dishMegs[i]+"\t");
			    		System.out.print(times[i]+"\t");
			    		System.out.print(addresses[i]+"\t");
			    		System.out.print(sumPrices[i]+"\t");
			    		if (states[i]==0) {
			    			System.out.println("��Ԥ��");
						}else{
							System.out.println("��ǩ��");
						}
			    		}
					}
			    	break;
			    case 3:
			    	//ǩ�ն���
			    	System.out.println("***ǩ�ն���***");
			    	System.out.println("��������Ҫǩ�յĶ�����");
			    	int qianshounum=input.nextInt();
			    	boolean find=false;
			    	for (int i = 0; i < names.length; i++) {
						if (names[i]!=null&&states[i]==0&&qianshounum==i+1) {
							states[i]=1;
							System.out.println("����ǩ�ճɹ���");
							find=true;
						}else if ((names[i]!=null)&&(states[i]==1)&&(qianshounum==i+1)){
							System.out.println("���Ķ�����ǩ�գ������ٴ�ǩ�գ�");
						}
					}
			    	if (!find) {
						System.out.println("��ѡ��Ķ��������ڣ�");
					}
			    	
			    	break;
			    case 4:
			    	//ɾ������
			    	System.out.println("***ɾ������***");
			    	boolean finda=false;
			    	System.out.println("��������Ҫɾ���Ķ�����");
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
							System.out.println("����ɾ���ɹ���");
							break;
						}else if (names[i]!=null&&states[i]==0&&shanchunum==i+1) {
							System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ��");
							finda=true;
							break;
						}
					}
			    	     if (!finda) {
							System.out.println("��Ҫɾ���Ķ��������ڣ�");
						}
			    	break;
			    case 5:
			    	//��Ҫ����
			    	System.out.println("***��Ҫ����***");
			    	System.out.println("���"+"\t"+"����"+"\t"+"����");
			    	for (int i = 0; i < dishNames.length; i++) {
			    		String price=prices[i]+"Ԫ";
			    		String praiseNum=(praiseNums[i]>0) ? (praiseNums[i]+"��") : "0";
			    		System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price
			    				+"\t"+praiseNum);	
					}
			    	System.out.println("��ѡ����Ҫ���޵���ţ�");
			    	int priaiseNum=input.nextInt();
			    	praiseNums[priaiseNum-1]++;
			    	System.out.println("���޳ɹ���");
			    	break;
			    case 6:
			    	//�˳�ϵͳ
//			    	isExit=true;
//			    	break;
			    default://���ܱ��¼�������Ϊ�˳�ϵͳ
			    	isExit=true;
			    	 input.close();
			    	break;
			}
			
			
			if(!isExit) {//���˳�ϵͳ��¼��0�����Է������˵�
				System.out.print("����0�������˵�:");
			    num=input.nextInt();
			}else {//����ѭ��
				break;
			}
			
		}while(num==0);
			
		
		
		
	
	}

}
