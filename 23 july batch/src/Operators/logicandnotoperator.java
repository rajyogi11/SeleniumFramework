package Operators;

public class logicandnotoperator {
	
	public static void main (String[] args) {
	
// && operator
		
		System.out.println((10>5) && (12>6)); // true
		System.out.println((10>5)&&(2>6));// false
		
	// || OR Operator
		int a = 12;
	
	    System.out.println((a>45) || (34>87 ));// false
	    System.out.println((a<3) || (5>2));// true
	
	// Not operator 
	    int b = 3;
	    int c = 7;
	    
	
	    System.out.println(!(b==5));// true
	    System.out.println((c==7));// false
	
	
	
	    // && operator using all condition
	    int d = 20;
	    
	    		
	    System.out.println((50<100) && (d>55)); // false 
	    System.out.println((6<12) && (12<6));// false 
	    System.out.println((45>33) && (33>50));// false 
	    System.out.println((20>10) && (10<20));// true 
	    
	    // || OR Operator
	  
	    
	    System.out.println(8>5); // true
	    System.out.println((2>3) || (5<8));// true
	    System.out.println(5<6);// true
	    System.out.println((2>3) || (5<3));// false
	
	    // Not Operator
	
	    System.out.println(!(50==100));// true
        System.out.println(!(10==11));// false
	
	}	
	
	
	
	
	
	
	
	
}
