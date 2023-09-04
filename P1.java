import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class P1 {
public static void main(String[]args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "shivani");
	map.put(2, "ashwini");
	map.put(3, "samarth");
	map.put(4, null);
	map.put(5, null);
	map.put(6, null);
	System.out.println(map);
	System.out.println(map.get(3));
	TreeMap<Integer, String> m = new TreeMap<Integer, String>();
	m.put(8, "aashivani");
	m.put(9, "aa");
//	m.put(null,9);
	m.put(8, "aahwini");
	System.out.println(m);
	HashSet s = new HashSet();
	s.add("hey");
	s.add(2);
	s.add(null);
	s.add(2);
	s.add("ashu");
//	s.addAll((Collection) map);
	System.out.println(s);
	
	PriorityQueue q = new PriorityQueue<>();
	q.add("shivani");
	q.add("hii");
	q.add("ashu");
	System.out.println(q);
	
	
}
}
