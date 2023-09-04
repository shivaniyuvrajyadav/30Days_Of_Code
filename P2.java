/*convert array into arraylist */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P2{
	public static void main(String[] args) {
		Integer a [] = {1,2,3,4,5,6};
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i]);
		}
		System.out.println();
		List<Integer>list = new ArrayList<>(Arrays.asList(a));
		System.out.println("list "+ list);
		 
		String b [] = {"hii", "hello","bye"};
		
		List<String>list1 = new ArrayList(Arrays.asList(b));
		System.out.println(list1);
	}
	
}
