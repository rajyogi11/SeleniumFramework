package DataCasting;

public class TestUpcasting {
	
	public static void main(String[] args) {
		
		
System.out.println("******with super class object********");
		
		Upcasting x = new Upcasting();
		x.teacher();
		x.test();
		x.cricket();
	
System.out.println("******with sub class object********");
		
		InUpcasting1 y = new InUpcasting1();
		y.cricket();
		y.test();
		y.teacher();
		
System.out.println("******with up casting*******");
		
		Upcasting z = new InUpcasting1();
		z.teacher();
		z.test();
		z.cricket();
		
		System.out.println("*******Down casting");
		
		InUpcasting1 ar = (InUpcasting1) new Upcasting();
		ar.teacher();
		ar.test();
		ar.cricket();
		
		
		
	}
	
 

}
