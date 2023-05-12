package Interface;

public class Abc implements Int1 { // multiple inheritance
	
	public void demo (){
		
		System.out.println("Interface is running demo");
		
	}
	public void memo () {
		
		System.out.println("Interface is running memo");
	}
	public void car () {
		int i = 44;
		System.out.println(i);
	}
	public void ABC() {
		float p = 44.1F;
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		
		
		Abc x = new Abc ();
		x.demo();
		x.memo();
		x.ABC();
		x.car();
		
	}
	
	
	

}
