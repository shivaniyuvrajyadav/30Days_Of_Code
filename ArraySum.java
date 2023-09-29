//Program to find sum of elements in a given array
public class ArraySum {
public static void main (String[]args) {
	int sum = 0;
	
	int [] a = {2,2,5};
	for (int i = 0;i<a.length;i++) {
		sum = sum + a[i];
	}
	System.out.println(sum);
}
}
