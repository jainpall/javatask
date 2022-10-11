package java8_features.streams_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringOperations {

	public static void main(String[] args) {
		//Inefficient way of working with the Java collections
		
		List<Student> studentList = Arrays.asList(
					new Student(123, "Mathi", "Chennai"),
					new Student(135, "Bharathy", "Chennai"),
					new Student(13, "Amuthesh", "Bengaluru"),
					new Student(12, "Subha", "Delhi"),
					new Student(1223, "Pallavi", "Mumbai"),
					new Student(23, "Hari", "Hyderabad"),
					new Student(3, "Raja", "Chennai"),
					new Student(2, "Unni", "Kochi"),
					new Student(1273, "Anant", "Kashmir"),
					new Student(1, "Amirthavarshini", "Haryana")
				);
		
//		Normal and inefficient code
//		for(Student s: studentList) {
//			if(s.getSid() > 100) {
//				System.out.println(s);
//			}
//		}
		
		Predicate<Student> myFilterCondition = (s)-> s.getSid() > 100;
		
//		 Elaborated code
//		Stream<Student> studentStream = studentList.stream();
//		Stream<Student> filteredStudentStream = studentStream.filter(myFilterCondition);
//		List<Student> filteredStudentList = filteredStudentStream.collect(Collectors.toList());
		
//		Simplified code 
		
		List<Student> filteredStudentList = 
				studentList.stream().filter(s -> s.getSid()>100).collect(Collectors.toList());
		
//		Unfiltered list
		System.out.println("Unfiltered list");
		System.out.println(studentList);
//		Filtered list
		System.out.println("Filtered list");
		System.out.println(filteredStudentList);
		
		
//		To convert a list into a set - Normal operation
//		HashSet<Student> hashSet = new HashSet<>();
//		for(Student s: studentList) {
//			hashSet.add(s);
//		}
			
//		To convert a list into a set using streams
		Set<Student> studentSet = studentList.stream().collect(Collectors.toSet());
		System.out.println(studentSet);
	}
}
