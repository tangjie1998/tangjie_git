
public class StudentoneTest {
//	在控制台输出如下：
//
//	姓名：张三
//	年龄：18
//	成绩：88
//	老师备注：几次模拟考试成绩起伏较大。
//	-----------------------------
//	姓名：李四
//	年龄：19
//	成绩：95.5
//	老师备注：几次模拟考试成绩比较稳定，希望保持发挥。
//	------------------------------
//	姓名：李四
//	年龄：19
//	成绩：95.5
	public static void main(String[] args) {
		Studentone a=new Studentone();
		a.age=18;
		a.score=55;
		a.name="张三";
		a.remark="几次模拟考试成绩起伏较大。";
		a.show(a);
		Studentone b=new Studentone();
		b.age=19;
		b.score=95.5;
		b.name="李四";
		b.remark="几次模拟考试成绩比较稳定，希望保持发挥。";
		b.show(a);
		Studentone c=new Studentone();
		c.show(a);
	}
	
	
	
	
	
}
