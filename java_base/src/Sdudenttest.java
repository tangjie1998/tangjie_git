
public class Sdudenttest {//3、有下面四位同学：
//	小王，25 ，男，01
//	小红，20，女，02
//	小三，19，男，03
//	小张，15，男，04
//	输出小王小红的信息。
	public static void main(String[] args) {
		Student a=new Student();
        a.name="小王";
        a.age=25;
        a.sex='男';
        System.out.println(a.name+"\t"+a.age+ "\t"+a.sex);
        teacher b=new teacher();
        b.name="小红";
        b.age=20;
        b.sex='女';
        System.out.println(b.name+"\t"+b.age+ "\t"+b.sex);
	}

	
}
