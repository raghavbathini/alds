package interview.persistent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharactersCount {

	public static void main(String[] args) {
		String s = "misssissippi";
		HashMap<Character , Integer> hm = new HashMap<Character, Integer>();
		for(int i=0; i< s.length(); i++) {
			Character current_char = s.charAt(i);
			if(hm.containsKey(current_char)) {
				hm.put(current_char, hm.get(current_char)+1);
			} else {
				hm.put(current_char, 1);
			}
		}
		
//		for(Character ch: hm.keySet()) {
//			System.out.println(ch+"---->"+hm.get(ch));
//		}
		
		Set<Entry<Character, Integer>> set = hm.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
		Comparator<Map.Entry<Character, Integer>> com = new Comparator<Map.Entry<Character, Integer>>(){

			@Override
			public int compare(Entry<Character, Integer> o1,
					Entry<Character, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		};
		Collections.sort(list, com);
		
		for(Entry<Character, Integer> entry: list)
			System.out.println(entry.getKey()+"----->"+entry.getValue());


	}

}
