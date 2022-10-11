package file_handling.legacy_File_class;

import java.io.File;

public class ListingTheFilesInAFolder {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\Dell\\Desktop\\folder");
		
//		List the file names of the files in a folder
		String[] fileNames = folder.list();
		for(String fName: fileNames) {
			System.out.println(fName);
		}
	}
}
