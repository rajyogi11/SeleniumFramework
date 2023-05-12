package StticNsttic;

public class Stntvariable {
	
	
	static int a= 10;
	int b =20;
	public static void main(String[] args) {
		
		
		System.out.println("Static variable =" +a); // 10
		
		Stntvariable x = new Stntvariable () ; 
		
		System.out.println("Non - static variable call with ref of x ="+ x.b); // 20
		
		Stntvariable  y = new Stntvariable ();
		System.out.println("Non - static variable call with ref of y =" + y.b); // 20
		
		x.b = 45;
		System.out.println("Non static variable call with ref x updated =" + x.b); // 45
		System.out.println("Non-static variable call with ref of y =" + y.b); // 20
		
		System.out.println("static variable call with ref of x ="+ x.a); // 10
		System.out.println("static variable call with ref of y ="+ y.a);// 10
		
		x.a = 80 ;
		System.out.println("static variable call with ref of x updated =" + x.a); // 80
		System.out.println("static variable call with ref of y updated =" + y.a); // 80
		
		
	}

}
