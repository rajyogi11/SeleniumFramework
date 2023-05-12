package arrayProgr;

public class FindPrimeNoFArray {
	
	public static void main(String[] args) {
		
		int arr [] = {10,55,20,44,3,11};
		
		boolean temp=true;
		
		for(int i=0; i<=arr.length; i++) {
			
			temp = true;
			
			if(arr[i]==0) {
				
				temp=false;
			}
			
			else {
				
				for(int j=i+1; j<arr.length; j++) {
					
					if(arr[i]%arr[j]==0) {
						
						
						temp=false;
						break;
					}
				}
			}
			
			if(temp) {
				
				if(arr[i]==0) {
					
				}
				
				else {
					System.out.println(arr[i]);
				}
				
			}
			
			
		
	}
		
		

	
}
}