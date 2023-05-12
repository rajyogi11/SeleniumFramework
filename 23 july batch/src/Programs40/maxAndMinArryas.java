package Programs40;

 // find max array

public class maxAndMinArryas {
	
	public static void main(String[] args) {
		
		int [] mr = {850,52,77,10000,78,330,770,123455};
		
		int a = mr[0]; //assume largest value
	
		//System.out.println(a);   // mr[0]=850 
		
		for(int i=1; i<mr.length; i++) {  // 0 1 2 3 4  5 6 7
			
			if(mr[i]<a) {   //  less than for minimum and greater than for max array
				
				a=mr[i]; //  100000  1245555
			}
		}
		System.out.println(a);
		}

}
