package parameter;

public class Practice1 {
	
	
	public static void Addtion (int a, int b) {
		
		int z = a+b;
		System.out.println("Addtion =" +z);
		
		
	}

	public void multiplication (int d, int f) {
		int k = d*f;
		System.out.println("Multiplication =" +k);
	}
	
	
	


     public static void main(String[] args) {
	
	Practice1 f = new Practice1();
	
	Practice1.Addtion(10, 20);
	
	f.multiplication(10, 20);
	
	Practice1.Addtion(40, 40);
}    
    
     
}