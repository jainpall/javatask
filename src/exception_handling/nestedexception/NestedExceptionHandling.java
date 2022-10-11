package exception_handling.nestedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedExceptionHandling {
	public static void openFile() {
		FileInputStream fis = null;
		String filePath1 = "C:\\Users\\Dell\\Desktop\\file1.txt";
		String filePath2 = "C:\\Users\\Dell\\Desktop\\file2.txt";

		try {
			fis = new FileInputStream(filePath1);
			System.out.println("File 1 is available and opened...");
		}
		catch(FileNotFoundException e) {
			System.out.println("File 1 not found... Trying to open file 2");
			try {
				fis = new FileInputStream(filePath2);
				System.out.println("File 2 is available and opened");
			}
			catch(FileNotFoundException f) {
				System.out.println("File 2 is also not available...");
			}
			finally {
				try {
					fis.close();
					System.out.println("File 2 has been closed...");
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		}
		finally {
			try {
				fis.close();
				System.out.println("File 1 closed successfully...");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		openFile();
	}
}
