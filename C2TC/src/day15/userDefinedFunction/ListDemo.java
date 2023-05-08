package day15.userDefinedFunction;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		Student s1 = new Student(11, "Glory", 45);
		Student s2 = new Student(12, "Venni", 55);
		Student s3 = new Student(13, "Glo", 65);
		Student s4 = new Student(14, "sharmi", 75);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		 System.out.println("Student Details:"+list);

	}

}
