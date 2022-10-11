package java8_features.streams_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindingTheMaxMinScore {
	public static void main(String[] args) {
		List<Integer> marksList = Arrays.asList(78, 99, 100, 65, 45,35);
		
		Comparator<Integer> sortNums = (n1, n2) -> n1-n2;
		Integer maxNum = marksList.stream().max(sortNums).get();
		Integer minNum = marksList.stream().min(sortNums).get();
		
		System.out.println("Max number: "+maxNum);
		System.out.println("Min number: "+minNum);
	}
}
