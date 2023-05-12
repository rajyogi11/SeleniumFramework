package arrayProgr;

public class Single {
	
	public static void main(String[] args) {
		
		int a []= {10,20,30,40,50};
		
		for(int i=0;i<a.length; i++) {
			
			int z;
			z=a[3];
			a[3]=(a[4]);
			a[4]=z;
			
			System.out.println(z);
			//System.out.println(a[]);
			
		}
	}
}

