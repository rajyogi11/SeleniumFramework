package arrayProgr;

public class NthArray {
	
	public static void main(String[] args) {
		

			//85 12  78

			int a [] = {12,78,85,65,22,85};

			int n=1;

			for(int i=0; i<a.length-1; i++){

			for(int j=i+1; j<a.length-1; j++){ // sorting in descending order
				

			if(a[i]<a[j]){

			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;

			}
			
			}
			
			if(i==n-1){
				
				System.out.println(a[i]);
				
				break;
			}
			}
			
			
             System.out.println("-----------------------");
			
			for(int i=0; i<=a.length-1; i++) {  // no need just for understanding the sorting array
			System.out.println(a[i]);
			
			}


			
	}

}
