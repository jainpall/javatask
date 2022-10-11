package exception_handling.custom_exception;

import java.io.IOException;

public class CustomExceptionsExample {
	
	public static void findARecord(int sid) throws IOException {
//	Code to connect to the database and read
	if(sid > 50) {
		throw new IOException("Record not found...");
	}
}
public static void main(String[] args) {
	try {
		findARecord(4);
		System.out.println("Record found...");
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
}

	}


