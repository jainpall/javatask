package file_handling.legacy_File_class;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFolderAndManyFiles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fileName="";
		String path = "C:\\Users\\Dell\\Desktop\\folder";
		File folder = new File(path);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder was not available and created a new one...");
		}
		System.out.println("Input no of files to be created:");
		int noOfFiles = s.nextInt();
		
		System.out.println("Input file names with extension: ");
		for(int i=0; i< noOfFiles; i++) {
			fileName = s.next();
			folder = new File(path+"\\"+fileName);
			try {
				folder.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("All the required files and folders are created...");
	}
}
