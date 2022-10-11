package java8_features.streams_api;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferencing {
	public static void main(String[] args) {
		Consumer<String> consumer1 = (message)-> System.out.println(message);
		consumer1.accept("Hello world...");
		
		StringUtility sUtil = new StringUtility(" ");
		Consumer<String> consumer2 = sUtil::printMessage;
		consumer2.accept("Welcome to Java 8");
		
		Consumer<String> consumer3 = StringUtility::new;
		consumer3.accept("Constructor referencing");
		
//		Predicate<String> predicate1 = (message) -> message.length()>5;
//		System.out.println("Is it a big message: "+predicate1.test("This is my message"));
//	
//		Predicate<String> predicate2 = StringUtility::isBigMessage;
//		System.out.println("Is it a big message: "+predicate2.test("Hello.."));
	}
}
