package sorting_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingAList {
public static void main(String[] args) {
		
//		Creating the list first and add the elements to it later
//		List<String> namesList = new LinkedList<>();
//		namesList.add("Vignesh");
//		namesList.add("Dinesh");
//		namesList.add("Raja");
		
		List<String> namesList = Arrays.asList("Vignesh", "Dinesh", "arun", "Subhash", "Kamal");
		System.out.println("Before sorting...");
		System.out.println(namesList);
		Collections.sort(namesList);
		System.out.println("After sorting...");
		System.out.println(namesList);

		List<Student> studentList = Arrays.asList(
		
			new Student(123, "Bharathy", "Chennai"),
		    new Student(120, "Ajay", "Bengaluru"),
            	new Student(121, "Subhalaxmi", "Chennai"),
				new Student(124, "Hari", "Mumbai"),
				new Student(126, "Amuthesh", "Chennai"),
				new Student(127, "Anant", "Mumbai"),
				new Student(119, "Nupur", "Delhi"),
				new Student(1111, "Unni", "Kochi")
				);
		
		System.out.println("Before sorting...");
		Collections.sort(studentList);
		
		//bharathy.compareTo(subha);
		
		System.out.println("After sorting...");
		
		for(Student student: studentList) {
			System.out.println(student);
		}
	}
}



