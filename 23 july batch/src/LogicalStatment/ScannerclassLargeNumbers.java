package LogicalStatment;

import java.util.Scanner;

public class ScannerclassLargeNumbers {
	
//	public static Scanner s;
	
	public static void main(String[] args) {
		
		
	int n,m ;
	
	Scanner s = new Scanner(System.in);
	 
	System.out.print("Enter NO n ");
	 n=s.nextInt();
	 
	 System.out.print("Enter NO m ");
	 m=s.nextInt();
	
	 
	if(n>m ) {
		System.out.println("n is larger no"+n);
	}
	else if(m>n){
		System.out.println("m is larger no"+m);
	}
	else {
		System.out.println("both are eqaul");
	}
	
}
}