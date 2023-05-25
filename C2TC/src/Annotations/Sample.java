package Annotations;
import java.util.*;

public class Sample {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]){

	ArrayList<String> list=new ArrayList<String>();
	list.add("glory");
	list.add("vennila");
	list.add("jesus");

	for(Object obj:list)
	System.out.println(obj);

	}

}
