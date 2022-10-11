package file_handling.legacy_File_class;

import java.io.File;
import java.io.IOException;

public class CheckIfTheFileExists {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Dell\\Desktop\\testfile.txt");
		if(file.exists()) {
			System.out.println("The file/folder is available...");
			if(!file.isDirectory()) {
				System.out.println("It is a file");
			}
			else {
				System.out.println("It is a directory");
			}
		}
		else {
			System.out.println("File/folder not found");
			try {
				file.createNewFile();
				System.out.println("File created successfully...");
			} catch (IOException e) {
				System.out.println("Unable to create a new file: "+e.getMessage());
			}
		}
	}
}
