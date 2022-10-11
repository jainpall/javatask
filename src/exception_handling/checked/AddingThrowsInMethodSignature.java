package exception_handling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AddingThrowsInMethodSignature {
	
	public static void openFile() throws FileNotFoundException {
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\myle.txt");
			System.out.println("File available and opened...");
	}
	public static void callOpenFile1() throws FileNotFoundException{
		openFile();
	}
	
	public static void callOpenFile2() throws FileNotFoundException {
		callOpenFile1();
	}
	
	public static void main(String[] args){
		try {
			callOpenFile2();
		}
		catch(FileNotFoundException f) {
			System.out.println("Unable to open the file...");
		}
	}
}
