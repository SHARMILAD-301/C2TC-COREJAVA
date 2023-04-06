package constructor;

public class customer {
	customer()
	{
		System.out.println("Students Detail");
	
	} 
	void detail2()
	{
		System.out.println("Students Detail2");
	
	}
	public static void main(String[] args) {
		customer stu = new customer();
		System.out.println("main details");
		stu.detail2();
	}
}
