package arrayProgr;

public class Duplicate {
	
	public static void main(String[] args) {
		
		int [] a = {45,88,74,88,36,74,55};
		
		for(int i=0; i<a.length-1; i++) {
			
			for(int j=i+1;j<a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
