package Polymorphism;

public class Encapsulation1 extends Encapsulation {
	
	
	

	public static void main(String[] args) {
		
		
		Encapsulation1 x = new Encapsulation1(); // method calling 
		x.Test();
		
		
		
		Encapsulation y = new Encapsulation(); // 1st constructor calling wrapped with method
		y.Test();
		
		
		Encapsulation z = new Encapsulation(90,80); // 2nd constructor calling wrapped with method
		z.Test();
		
		Encapsulation a = new Encapsulation(10,20,30);// 3rd constructor calling 
		a.Test();
		
		
		  
		
	}
	

}
