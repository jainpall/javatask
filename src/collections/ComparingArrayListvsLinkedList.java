package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ComparingArrayListvsLinkedList {
	
	public static void calculateTimeTaken(List<Integer> list, String type) {
		long startTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add(0,i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time elasped for "+type+":"+(endTime-startTime));
		
		}
	 public static void main(String[] args) {
		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 calculateTimeTaken(arrayList, "Array List");
		 LinkedList<Integer> linkedList = new LinkedList<Integer>();
		 calculateTimeTaken(linkedList,"Linked List");
		 
	 }
	
	}
		 
	 


