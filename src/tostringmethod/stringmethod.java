package tostringmethod;

public class ToString
{
	public void display()
	{
		System.out.println("Welcome");
	}
	
	public String toString()
	{
		return "Welcome To Java Session.";
	}
	
	public static void main(String[] args)
	{
		ToString obj=new ToString();
		obj.display();
		
		System.out.println(obj);
		
	}
}