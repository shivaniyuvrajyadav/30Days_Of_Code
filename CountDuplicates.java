//Given an array which may contain duplicates, print all elements and their frequencies.
//
//Examples: 
//
//Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
//Output : 10 3
//         20 4
//         5  1
public class CountDuplicates {
public static void main (String[]args) {
	int arr[] = {10, 20, 20, 10, 20, 5, 20};
	int count ;
	int isCount [] = new int[arr.length];
	
	for(int i=0;i<arr.length;i++) {
		if(isCount[i]==1) {
			continue;
		}
		count = 1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				
				count++;
				isCount[j]= 1;
			}
			
		}
		System.out.println(arr[i] + " " +count);
	}
}
}
