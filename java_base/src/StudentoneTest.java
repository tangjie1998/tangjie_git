
public class StudentoneTest {
//	�ڿ���̨������£�
//
//	����������
//	���䣺18
//	�ɼ���88
//	��ʦ��ע������ģ�⿼�Գɼ�����ϴ�
//	-----------------------------
//	����������
//	���䣺19
//	�ɼ���95.5
//	��ʦ��ע������ģ�⿼�Գɼ��Ƚ��ȶ���ϣ�����ַ��ӡ�
//	------------------------------
//	����������
//	���䣺19
//	�ɼ���95.5
	public static void main(String[] args) {
		Studentone a=new Studentone();
		a.age=18;
		a.score=55;
		a.name="����";
		a.remark="����ģ�⿼�Գɼ�����ϴ�";
		a.show(a);
		Studentone b=new Studentone();
		b.age=19;
		b.score=95.5;
		b.name="����";
		b.remark="����ģ�⿼�Գɼ��Ƚ��ȶ���ϣ�����ַ��ӡ�";
		b.show(a);
		Studentone c=new Studentone();
		c.show(a);
	}
	
	
	
	
	
}
