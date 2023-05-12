package Programs40;

public class NthNumberarray {
	
	public static void main(String[] args) {
		
		int r [] = {54,20,50,888,60,999,100,30}; // max sec third min sec min all cover in this program
		
		int n=4;
		
		for(int i=0; i<r.length-1; i++) {
			
			for(int j=i+1; j<r.length; j++) {
				
				if(r[i]>r[j]) {  // less than <  for max arry // greater than > for min aaray
					
					int temp = r[i];
					r[i]=r[j];
					r[j]=temp;
					
				}
			}
			if(i==n-1) {  // sorting the array list in descending if < this use and vies versa
				System.out.println(r[i]);
				break;
			}
		}
		
		System.out.println("-----------------");
		
		for(int i =0; i<=r.length-1; i++) {
			
			System.out.print(r[i]+" ");
		}
	}

}


