package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class WorkingWithMaps {
	
//	public static void addToMap() {
//		
//	}
	
	public static void main(String[] args) {
		
//		HashMap
//		HashMap<Integer, String> hashMap = new HashMap<>();
//		
//		hashMap.put(127, "Vignesh");
//		hashMap.put(124, "Dinesh");
//		hashMap.put(129, "Raja");
//		hashMap.put(126, "Rajeshwari");
//		hashMap.put(124, "Subhalaxmi");
//
//		
//		System.out.println(hashMap);
//		
		
//		LinkedHashMap
//		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
//		
//		linkedHashMap.put(127, "Vignesh");
//		linkedHashMap.put(124, "Dinesh");
//		linkedHashMap.put(129, "Raja");
//		linkedHashMap.put(126, "Rajeshwari");
//		linkedHashMap.put(128, "Subhalaxmi");
//
//		
//		System.out.println(linkedHashMap);
		
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(127, "Vignesh");
		treeMap.put(124, "Dinesh");
		treeMap.put(129, "Raja");
		treeMap.put(126, "Rajeshwari");
		treeMap.put(128, "Subhalaxmi");
		
		System.out.println(treeMap);
		
		//Getting a particular element from the map
		System.out.println(treeMap.get(126));
		
//		Getting all the keys in a map
		Set<Integer> keys = treeMap.keySet();
		System.out.println(keys);
		
		// For iterating a set/list
		//for (Integer key: keys) {
			//System.out.println(key);
		//}
		
//		Getting all the values in a map
		Collection<String> values = treeMap.values();
		System.out.println(values);
		
		for(Map.Entry<Integer, String> m: treeMap.entrySet()) {
			System.out.println(m.getValue());
		}
	}
}












