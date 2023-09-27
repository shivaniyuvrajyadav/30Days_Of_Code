//Program to check if a number is Positive, Negative, Odd, Even, Zero
import java .util.Scanner;
public class checkPositivenegativeOddEvenZero {
public static void main (String[]args) {
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt();
	if(a>0) {
		System.out.println("Positive");
	}
	else if(a<0) {
		System.out.println("Negative");
	}
	else if(a==0){
		System.out.println("zero");
	}
	
	if(a%2!=0) {
		System.out.println("odd");
	}
	else if(a%2==0) {
		System.out.println("even");
	}
	
	sc.close();
}
}
