package oops.methods;

public class StringUtility {
	public void sayHello() {
		System.out.println("Hello world");
	}
	
	public String getName() {
		return "Dinesh Kumar";
	}

	public int getNameLength(String name) {
		return name.length();
	}

	public String joinName(String fName, String lName) {
		return fName+" "+lName;
	}
	
	public char getFirstLetter(String name) {
		return name.charAt(0);
	}
}



	
