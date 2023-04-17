package day4.first;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		int n = 10;
		p.setNumber(n);
		//p.toString();
		p = new Person(n);//Parameterized constructor
		System.out.println("Number is: "+p.getNumber());
	}

}
