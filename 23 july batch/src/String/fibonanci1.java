package String;

public class fibonanci1 {
	public static void main(String[] args) {

		
		int N = 10,a = 0, b = 1  ;
		
		// int a = 0;                   diff ways of declaration
		// int b = 1;
		// int c;
			
		for (int i = 0;i<N;i++) {
			
		int	c = a+b;                 // 0 1    
			
			System.out.print(a+ " ");
			
			a = b;
			b = c;
			
			
			//System.out.println(a+ " ");
		}

	}

}
