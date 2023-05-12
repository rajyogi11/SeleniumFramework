package Programs40;

public class Hcf {
	
	public static void main(String[] args) {
		
		  int a=120;
		  int b=150;
		  int gcd;
	     
	      
	      gcd = a;
	      
	      while(true)
	      {
	         if((a%gcd==0) && (b%gcd==0)) { // reminder is output of this program
	            break;
	      }
	         else {
	            gcd--;
	    //        System.out.print(gcd+" ");
	         }
	      }
	      
	      System.out.println("HCF of Given Two Number = " +gcd);
	}



// find largest table value whose divide both numbers directly
// hcf mhanje ashi sankhya ki jya sankhne dilelya donhi sakyana direct bhag jail
	}

