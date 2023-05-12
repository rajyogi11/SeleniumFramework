package ScannerC;


import java.util.Scanner ;

public class Sccn2 {
	
	public static void main(String[] args) {
		
		Scanner demo = new Scanner (System.in);
		
		System.out.println("Enter integer value");
		
		int value = demo.nextInt() ;
		
				System.out.println("You are integer value is"+ value);
		
		System.out.println();
		
		
		System.out.println("Enter double value");
		
		double value1 = demo.nextDouble();
		
		System.out.println("You are double value is" + value);
		
		System.out.println();
		
		System.out.println("Enter String value");
		
		String value2 = demo.next();
		System.out.println("Your String value" + value);
		
		
       demo.close();
	}

}   
