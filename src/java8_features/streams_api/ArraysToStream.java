package java8_features.streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysToStream {

	public static void main(String[] args) {
		Integer[] marks = {21, 3, 43, 55, 34, 67, 20};
		
//		Filtered the array elements using stream and creating a new array after filtering
//		Stream.of(marks).filter(m-> m>35).forEach(System.out::println);
		Integer[] array = Stream.of(marks).filter(m -> m>35).toArray(Integer[]::new);
		
//		Converting a list into an array
		List<Integer> marksList = Arrays.asList(43, 2, 11, 36, 54, 87);
		Integer[] marksArray = marksList.stream().toArray(Integer[]::new);
		
//		Array to list after converting an array into a stream
		List<Integer> marksListFromArray = Stream.of(marks).collect(Collectors.toList());
		
//		Array to set after converting an array into a stream
		Set<Integer> marksSet = Stream.of(marks).collect(Collectors.toSet());
	
//		List to set after converting the list into stream
		marksList.stream().collect(Collectors.toSet());
		
//		Set to list after converting the set into stream
		marksSet.stream().collect(Collectors.toList());
	}
}

