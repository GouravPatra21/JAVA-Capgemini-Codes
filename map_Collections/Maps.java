package map_Collections;
import java.util.TreeMap;
import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.List;
public class Maps {
	public static void main(String[] args) {
//		TreeMap tm = new TreeMap<>();
//		tm.put(1, "Hello");
////		tm.put(9, 89);
////		tm.put(5, 76);
//		tm.put(3, "demo");
//		tm.put(7,"World");
//		tm.put(4, "Subject");
//		tm.put(6, null);
//		tm.put(1, null);
//		System.out.println(tm);
//		
//		System.out.println(tm.containsKey(5));
//		System.out.println(tm.containsKey(10));
//		
//		System.out.println(tm.containsValue(null));
//		System.out.println(tm.containsValue("Hello"));
//		
//		System.out.println(tm.replace(9, 90));
//		System.out.println(tm.replace(9, 90, 100));
//		System.out.println(tm);
//		
//		System.out.println(tm.ceilingKey(2));
//		System.out.println(tm.ceilingKey(10));
		
//		Set<Integer> set = tm.keySet();
//		Iterator<Integer> itr1 = set.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
//		
//		System.out.println("--------------------------------");
//		
//		Collection<String> c = tm.values();
//		Iterator<String> itr2 = c.iterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//		
//		System.out.println("---------------------------------");
//		
//		Set<Entry<Integer, String>> s = tm.entrySet();
//		Iterator itr3 = s.iterator();
//		while(itr3.hasNext()) {
//			System.out.println(itr3.next());
//		}
//		System.out.println();
//		
//		for(Entry<Integer, String> e : s) {
//			System.out.println(e.getKey() + "--------->" + e.getValue());
//		}
//		
		
		TreeMap<String, List<String>> map = new TreeMap();
		List<String> l1 = Arrays.asList("Hyderaad", "Bangalore", "Kolkata");
		List<String> l2 = Arrays.asList("J&k","Assam", "Mizoram");
		List<String> l3 = Arrays.asList("Hubli","Dharwad", "Bhilwara");
		
		map.put("SBI", l1);
		map.put("ICICI", l2);
		map.put("Federal", l3);
		System.out.println(map);
		
		Set<String> set = map.keySet();
		Iterator<String> itr4 = set.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		System.out.println("--------------------------------");
		
		Collection<List<String>> c = map.values();
		Iterator<List<String>> itr2 = c.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("---------------------------------");
		
		Set<Entry<String, List<String>>> s = map.entrySet();
		for(Entry<String, List<String>> e : s) {
			System.out.println(e.getKey() + "--------->" + e.getValue());
		}
		
		
	}

}
