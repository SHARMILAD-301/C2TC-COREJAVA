package day3;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String name, city;
		 int id;
		 System.out.println("Enter the CustomerId");
		 id = sc.nextInt();
		 System.out.println("Enter the CustomerName");
		 sc.nextLine();
		 name = sc.nextLine();
		 System.out.println("Enter the CustomerCity");
		 city = sc.nextLine();
		 
	Customer cust = new Customer();
	cust.setCustomerId(id);
	cust.setCustomerName(name);
	cust.setCustomerCity(city);
	System.out.println(cust);
	}

}
