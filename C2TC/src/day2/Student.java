package day2;

public class Student {
	void detail()
	{
		System.out.println("Students Detail");
	
	}
	void detail2()
	{
		System.out.println("Students Detail2");
	
	}
	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println("main details");
		stu.detail();
		stu.detail2();
	}

}
