package java8_features.streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMarks {
	public static void main(String[] args) {
		List<Integer> marksList = Arrays.asList(23, 100, 37, 34, 99, 98);
		
		List<Integer> sortedList = marksList
				.stream()
				.sorted((m1, m2)-> m2-m1)
				.collect(Collectors.toList());
		
		
		Integer maxMarks = marksList
				.stream()
				.sorted((m1, m2)-> m2-m1)
				.collect(Collectors.toList())
				.get(0);
	
		Integer minMarks = marksList
				.stream()
				.sorted((m1, m2)-> m1-m2)
				.collect(Collectors.toList())
				.get(0);
		
		System.out.println(sortedList);
		System.out.println("Min Marks: "+minMarks);
		System.out.println("Max Marks: "+maxMarks);
	}
}
