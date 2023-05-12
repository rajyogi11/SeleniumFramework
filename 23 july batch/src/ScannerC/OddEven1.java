package ScannerC;

import java.util.Scanner;

public class OddEven1 {
	
	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		
		int n ;
		
		System.out.println("Enter the number you want to check: ");
		
		n = d.nextInt();
		
		if (n % 2 ==0) {
		
		System.out.println("The given number "+n+" is even");
		
		
	}
		else {
			System.out.println("The given number "+n+" is odd");
			
			d.close();
		}

}
}
