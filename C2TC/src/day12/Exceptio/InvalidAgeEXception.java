package day12.Exceptio;

public class InvalidAgeEXception extends Exception{
	public InvalidAgeEXception()
	{
		super("Invalid Age");
	}
	InvalidAgeEXception(String message){
		super("U cant vote");
	}
}
