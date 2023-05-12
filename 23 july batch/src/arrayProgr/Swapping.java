package arrayProgr;

public class Swapping {
	
	public static void main(String[] args) {
		
		//         1  2  3  4   5  6  7  length-1 = 6 index
		int a[] = {30,50,60,54,65,78,29,};
		//          0  1  2  3  4  5  6  index
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i =0; i<(a.length/2); i++) {
			int z;  // new variable declaration 
			
			z=a[i];       // z=30
			a[i]=a[(a.length-1)-i]; // a[6]  0,1,2, index iterated
			
		a[(a.length-1)-i]=z;  // z=a[i]
		}
		System.out.println();
		
		
		
		
		for(int i =0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}
}



