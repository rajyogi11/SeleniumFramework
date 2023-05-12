package StticNsttic;

public class practice1 {
	
	
	
	public static void mobile() { // static
		
		int t = 41;
		int y =12;
		int z=t+y;
		int k=t-y;
		
		System.out.println("Addition ="+z);
		System.out.println("Substraction ="+k);
		
	}

         public void phone() { // non static
        	 
        	 int i =12;
        	 int b=74;
        	 int c=b/i;
        	 int l=b*i;
        	 
        	 System.out.println("Multiplication =" +l);
        	 System.out.println("Division =" +c);
         }
	   

   
	public static void main(String[] args) { // calling same class
		
		mobile(); // static method
		
		practice1 s = new practice1();
			s.phone();	
		
	}
}
