package file_handling.legacy_File_class;

import java.io.File;

public class DeletingFilesInAFolder {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\Dell\\Desktop\\folder");
//		List the files in a folder ---> Gives control on the files inside the folder
		File[] fileNames = folder.listFiles();
		for(File file: fileNames) {
			try {
				Thread.sleep(2000);
				file.delete();
				System.out.println(file.getName()+" has been deleted");
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		folder.delete();
		System.out.println("Folder and files inside are deleted...");
	}
}
