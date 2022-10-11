package java8_features.streams_api;

public class StringUtility {
	
	public StringUtility(String message) {
		System.out.println("Message received: "+message);
		System.out.println("Using constructor");
	}
	
	public void printMessage(String message) {
		System.out.println("Message received: "+message);
		System.out.println("Using non static method");
	}
	
	public static boolean isBigMessage(String message) {
		System.out.println("Message received: "+message);
		System.out.println("Using static method");
		return message.length()>5;
	}
}

