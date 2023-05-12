package ScannerC;

	
	import java.util.Scanner ;
	
	public class ScannerClass {
		
		public static void main(String[] args) {
			
			Scanner reader = new Scanner (System.in) ; // object create for scanner class
			
			System.out.println("Enter integer value"); // for integer
			
			int value = reader.nextInt();
			System.out.println("Your enter value is" + value);
			
			System.out.println();
			
			System.out.println("Enter float value"); // for float
			float value1 = reader.nextFloat();
			
			System.out.println();
			System.out.println("Enter String value"); // for String
			
			String value2 = reader.next();
			
			
			
			reader.close();
		}
		
	}
		
	
	
	
	


