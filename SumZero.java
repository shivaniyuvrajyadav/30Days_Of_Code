// Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.
import java.util.*;
public class SumZero{
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
int min1 = 0 ,min2= 1 , sum , minimum;
int n = sc.nextInt();
int a [] = new int [n];
for(int i = 0;i<n;i++){

a[i] = sc.nextInt();
}
minimum = Math.abs(a[0]+a[1]);
for (int i = 0;i<a.length;i++){ 
	for(int j=i+1;j<a.length;j++){
		sum = Math.abs(a[i]+a[j]);
if(sum<minimum){
 min1 = i;
 min2 = j;
 minimum = sum ; 
}
}
	
}
System.out.println(a[min1]);
System.out.println(a[min2]);
}
}
