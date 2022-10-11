package java8_features.streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ModifyingStudentMarks {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(98, 95, 99, 32, 25, 28, 15);
		
		System.out.println("Old marks: ");
		System.out.println(list);
		
		List<Integer> updatedMarksList = list
				.stream()
				.map(m-> {
					if(m<35) {
						m+=(35-m);
					}
					return m;
				})
				.collect(Collectors.toList());
	
		System.out.println("Updated marks: ");
		System.out.println(updatedMarksList);
	}
}
