package exception_handling.unchecked;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsWhenReadingRecords {
	static String []results = {"Arun", "Bhargav", "Ishan", "Raja"};
	public static String[] getRecords() {
		//Code to read from DB
		return results;
	}
	public static String getARecord(int index) {
		String recordRetrieved ="";
		try {
			recordRetrieved = results[index];
			System.out.println("Record retrieved successfully...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Requested record not found...");
		}
		return recordRetrieved;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("Input the index of the record you want to visit:");
		int index = s.nextInt();
		String record = getARecord(index);
		System.out.println(record);
	}
}
