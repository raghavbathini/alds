package collections.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// Declaring and adding mappings
		System.out.println("Declaring and adding mappings");
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(123, "abc");
		hm.put(456, "xyz");

		// Get all keys and values
		System.out.println("Get all keys and values");
		System.out.println(hm.keySet());
		System.out.println(hm.values());

		// Get value of existent key and non-existent key
		System.out.println("Get value of existent key and non-existent key");
		System.out.println(hm.get(123));
		System.out.println(hm.get(567));
		
		// New Hashmap and add mappings
		System.out.println("New Hashmap and add mappings");
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");

//		System.out.println("Iterating Hashmap...");
//		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
//
//		// Trying to add duplicate key, it will overwrite the already available value
//		System.out.println("Trying to add duplicate key, it will overwrite the already available value");
//		map.put(1, "Grapes"); // trying duplicate key
//
//		System.out.println("Iterating Hashmap...");
//		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
//
//		map.putIfAbsent(103, "Gaurav");
//
//		System.out.println("Iterating Hashmap...");
//		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
//
//		map.put(104, "Ravi");
//		map.putAll(hm);
//
//		System.out.println("Iterating Hashmap...");
//		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
//		
//		// Creation of HashMap 
//		HashMap<String, String> Geeks = new HashMap<>(); 
//
//		// Adding values to HashMap as ("keys", "values") 
//		Geeks.put("Language", "Java"); 
//		Geeks.put("Platform", "Geeks For geeks"); 
//		Geeks.put("Code", "HashMap"); 
//		Geeks.put("Learn", "More"); 
//
//		System.out.println("Testing .isEmpty() method"); 
//
//		// Checks whether the HashMap is empty or not 
//		// Not empty so printing the values 
//		if (!Geeks.isEmpty()) 
//		{ 
//			System.out.println("HashMap Geeks is notempty"); 
//
//			// Accessing the contents of HashMap through Keys 
//			System.out.println("GEEKS : " + Geeks.get("Language")); 
//			System.out.println("GEEKS : " + Geeks.get("Platform")); 
//			System.out.println("GEEKS : " + Geeks.get("Code")); 
//			System.out.println("GEEKS : " + Geeks.get("Learn")); 
//
//			// size() method prints the size of HashMap. 
//			System.out.println("Size Of HashMap : " + Geeks.size()); 
//		} 
//	     /* Display content using Iterator*/
//	      Set set = map.entrySet();
//	      Iterator iterator = set.iterator();
//	      while(iterator.hasNext()) {
//	         Map.Entry<Integer, String> mentry = (Entry<Integer, String>)iterator.next();
//	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//	         System.out.println(mentry.getValue());
//	      }
//		
////	      if(userCityMapping.containsKey(userName)) {
////	      if(userCityMapping.containsValue("New York")) {
//	      map.remove(5);  
		
	}

}
