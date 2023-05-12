package arrayProgr;

public class PrimeForArray {
	
	public static void main(String[] args) {
	  
	    int flag = 0;

	    int Arr[] = {10, 11, 13, 15, 17, 19, 23, 25, 30};

	    for (int j = 0; j < Arr.length; j++) {
	    	
	      flag = 0;
	      for (int i = 2; i < Arr[j] / 2; i++) {
	        if (Arr[j] % i == 0) {
	          flag = 1;
	          break;
	        }
	      }
	 //     System.out.printf("%3d - %s\n", Arr[j], (flag == 0 ? "Prime" : "Not Prime"));
	    }
	 //   System.out.println();
	  }
	}


	
	

	
	
