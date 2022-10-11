package file_handling.legacy_File_class;

import java.io.File;

public class CreatingFolders {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\Dell\\Desktop\\myfolder");
		
		if(folder.exists()) {
			if(!folder.isDirectory()) {
				System.out.println("It is a file");
			}
			else {
				System.out.println("It is a folder");
			}
		}
		else {
//			The mkdir() will create only one folder
			folder.mkdir();
			
//			The mkdirs() will create multiple folders
//			folder.mkdirs();
			System.out.println("Folder created...");
		}
	}
}

