import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
/* convert list into set */

public class P3 {
	public static void main  (String []args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(4);
		a.add(1);
		
	  HashSet<Integer> h = new HashSet<>();
	  h.addAll(a);
	  
		System.out.println(h);
	
	}

	
}
