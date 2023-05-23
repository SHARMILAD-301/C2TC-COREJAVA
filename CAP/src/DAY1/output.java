package DAY1;

public class output {
	static void compute (int a) throws Myexception
	{
	throw new Myexception(a);

	}

	public static void main(String args[])
	{
	try {

	compute(3);

	} catch (Myexception e)

	{	System.out.print("Exception");
	
	}
	}
}
