package oops.methods;

public class MainClass {
	public static void main (String [] args) {
		StringUtility sUtil = new StringUtility();
		
		sUtil.sayHello();
		System.out.println(sUtil.getName());
		System.out.println(sUtil.getNameLength(sUtil.getName()));
		System.out.println(sUtil.getFirstLetter(sUtil.getName()));
		System.out.println(sUtil.joinName("Vignesh", "M"));

		
	}
	
}
	

