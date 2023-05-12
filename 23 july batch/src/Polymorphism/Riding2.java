package Polymorphism;

public class Riding2 extends Riding { // method overriding
	
	public static void Addition () {
		System.out.println("Addition ended"); // static method   can't be override
	}
	
	public void Test () {  // non static method is override here change definition
		System.out.println("Run test method of sub");
	}
	
	public static void main(String[] args) {
		
		Riding x = new Riding2 (); // object create using super class reference
		x.Addition();
		
		
		Riding2 y = new Riding2 (); // sub class object create
		y.Test();
		
	
		
		
		
		
	
		
		
		
	}
	

}
