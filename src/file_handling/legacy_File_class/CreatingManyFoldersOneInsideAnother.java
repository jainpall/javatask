package file_handling.legacy_File_class;

import java.io.File;
import java.util.Scanner;

public class CreatingManyFoldersOneInsideAnother {
	public static void main (String [] args) {
		String path = "\\C:\\Users\\Dev\\Desktop\\ES6";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Input no f folders to be created...");
		int noOffolder = scanner.nextInt();
		
		int noOfFolder = 0;
		for(int i=1; i<= noOfFolder; i++) {
			path= path+ "sub"+ i;
			
		}
		
		File file = new File(path);
		file.mkdirs();
		
		System.out.println("Folders created sucessfully");
		
		
	}

}
