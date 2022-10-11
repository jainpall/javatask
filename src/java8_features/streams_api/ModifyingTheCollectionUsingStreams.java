package java8_features.streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ModifyingTheCollectionUsingStreams {
	public static void main(String[] args) {
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
		
		Function<Student, Student> functionToToAddStartsSuffix  = (s) -> {
				s.setsName(s.getsName()+"***"); 
				return s;
			};
		
		List<Student> filteredAndModifiedStudentList  = studentList.stream()
			.filter(s -> s.getSid() < 100)
			.map(functionToToAddStartsSuffix)
			.collect(Collectors.toList());
		
		System.out.println(filteredAndModifiedStudentList);
	}
}
