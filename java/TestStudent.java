class Student {
	String name;
	String Sextype;
	public void set(String newname, String newSex) {
		name = newname;
		Sextype = newSex;
	}
	public void get(Student stu) {
		System.out.println(stu.name + "的性别是" + stu.Sextype);
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student yi = new Student();
		Student er = new Student();
		yi.set("小明","MALE");
		er.set("小红","FEMALE");
		yi.get(yi);
		er.get(er);
	}
}