package strings;

public class StringHandling {
	
	public void stringImmutability() {
// String message = new String("Initial Message");
	String message = "Initial Message";
	System.out.println(message.hashCode());
	
	// message = new String("New Message");
	message = "New Message";
	System.out.println(message.hashCode());
	
	message = message + "!";
	System.out.println(message.hashCode());
	
	message = message.concat("Something new");
			
			System.out.println(message);
}

public static void main(String [] args) {
	StringHandling sh= new StringHandling();
	sh.stringImmutability();
}
}
	
	
	

