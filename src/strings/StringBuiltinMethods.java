package strings;

public class StringBuiltinMethods {
	public static void main(String[] args) {
		
		
				String message = "Hello world welcome to Natwest!";
				
				// To get a character at a particular position in a string - charAt(index)
				
				System.out.println("Element at 0th index: "+ (message.charAt(0)));
				System.out.println("Element at 1st index: "+ (message.charAt(1)));
				System.out.println("Element at last index: "+ (message.charAt( message.length()-1 )));
				System.out.println("Element at mid index: "+ (message.charAt( message.length()/2 )));
				int indexMidInFirstHalf = (0+message.length()/2)/2;
				System.out.println("Element at the mid of the first half of the string: "+(message.charAt(indexMidInFirstHalf)));
				int indexOfMid = message.length()/2;
				int indexMidInSecondHalf = (indexOfMid+message.length())/2;
				System.out.println("Element at the mid of the second half of the string: "+(message.charAt(indexMidInSecondHalf)));
		 
				
				// concat() method in strings
				
				String firstName = "Vignesh";
				String lastName = "Manoharan";
//				String fullName = firstName + lastName;
				String fullName = firstName.concat(lastName);
				
				System.out.println(fullName);
				
				//compareTo() method
				
				String name1 = "Vignesh";
				String name2 = "Vineeth";
				
				System.out.println(name1.compareTo(name2));
				System.out.println("arun".compareTo("Bala"));
				System.out.println("arun".compareTo("ananth"));
				
				if(name1.compareTo(name2)==0) {
					System.out.println("Both the names are equal");
				}
				else if(name1.compareTo(name2)<0) {
					System.out.println("Second string is bigger than the first");
				}
				else {
					System.out.println("First string is bigger than the second");
				}
				
				// converting cases to upper or lower
				
				String messageCaps = "WELCOMETOSTACKROUTE";
				String messageLower = "mjs fullstack development java course";
				
				System.out.println(messageCaps.toLowerCase());
				System.out.println(messageLower.toUpperCase());
				
				System.out.println(messageCaps);
				
//				To extract a part or portion of a string ---> substring(startIndex)
				String extractedString = messageCaps.substring(0, 6);
				System.out.println(extractedString);
				
//				To check if a string contains a particular text in it
				System.out.println(messageLower.contains("fullstack"));
				
				if(messageLower.contains("java")) {
					System.out.println("java is available");
				}
				else {
					System.out.println("java is not available");
				}
				
//				Case insensitive check if the source contains the search text
				
				String sourceText = "SOMEthing";
				System.out.println(sourceText.toLowerCase().contains("some"));
				
//				To check if a string starts with a particular character/sequence
				if(messageLower.startsWith("js")) {
					System.out.println("Yes the string starts with js");
				}
				else {
					System.out.println("No the string starts with something else");
				}
				
//				To check if a string ends with a particular character/sequence
				if(messageLower.endsWith("e")) {
					System.out.println("The string ends with e");
				}
				else {
					System.out.println("No ends with some other character");
				}
				
//				equals and equalsIgnoreCase methods
				
				String message1 = "MYMESSAGE";
				String message2 = "MyMessage";
				
//				System.out.println(message1.hashCode());
//				System.out.println(message2.hashCode());

				System.out.println("The equals() says: ");
				if(message1.equals(message2)) {
					System.out.println("Both the strings are equal");
				}
				else {
					System.out.println("Strings are not equal");
				}

				System.out.println("The equalsIgnoreCase() says: ");
				if(message1.equalsIgnoreCase(message2)) {
					System.out.println("Both are equal");
				}
				else {
					System.out.println("Both are not equal");
				}
				
//				Checking if a string is empty
				String newMessage = "a";
				
				System.out.println("Is the new message empty? "+newMessage.isEmpty());
				
//				Joining strings using join() and separating with a delimiter
				
				String date = "08th";
				String month = "March";
				String year = "1991";
				
				String dob = String.join(":", date, month, year);
				System.out.println(dob);
				
				String mess = "Hello Pallavi welcome to java full stack bootcamp!";
				System.out.println("Element at 5th index:"+ (mess.charAt(6)));
				System.out.println (mess.split(" ")[0]);
			}

	
	}

	
		




