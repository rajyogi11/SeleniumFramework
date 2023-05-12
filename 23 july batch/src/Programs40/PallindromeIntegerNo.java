package Programs40;

public class PallindromeIntegerNo {
	
	
	public static void main(String[] args) {
		  
		  
		  
		  int sum =0,r;
		    
		  int n=454;//It is the number variable to be checked for palindrome  
		  int temp=n ; 
		      
		 while(n>0){
		  
		//  for(int i=0; i<=temp; i++) {
			  
		   r=n%10;  //getting remainder   45.4 , 4.5, 0.4
		   n=n/10;
		   sum=(sum*10)+r;   // 4  5  4
		       //454/10=45.4 , 45/10=4.5 ,4/10=0.4 
		  }   
		  
		 
		  if(temp==sum) {   
		   System.out.println("palindrome number "); 
		  }
		  else {   
		   System.out.println("not palindrome");
		  }
	}
}
