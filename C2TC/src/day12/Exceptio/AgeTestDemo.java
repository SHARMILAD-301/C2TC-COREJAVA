package day12.Exceptio;
import java.util.*;
public class AgeTestDemo {
	static void validate (int age) throws InvalidAgeEXception { 
		if (age<18) {
			throw new InvalidAgeEXception("Invalid Age, You are not eligible to vote");
			
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age:");
		age=sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeEXception e) {
			System.err.println("Exception was caught: \n"+e.getMessage());
		}
		sc.close();
	}

}
