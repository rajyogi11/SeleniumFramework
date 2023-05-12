package ConsTructor_Java;

public class Constr3 {
	
	int q;
	int r;
	int s;
	char v;
	String name;
	
	Constr3 () { // constr1
		q=50;
		r=50; 
     }
	Constr3(int h, int i) {   // constr2
		q=h;
		r=i;
	}
	Constr3 (int j, int k, int l) { // constr3
		s =j;
		r=k;
		q=l;
	}
	Constr3 (char v, String name) { //Constr4
		v = '#'; 
		name = "Raj" ;
	}
	public void multiplication () {
		System.out.println(q*r*q);
	}
	public void Addition() {
		System.out.println(q+r+s);
	}
	public void Stt() {
		System.out.println('#');
		System.out.println("Raj");
	}
	
	
	public static void main(String[] args) {
		
		Constr3 o = new Constr3();
		o.multiplication(); // zero parameter
		
		Constr3 n = new Constr3 (30,30,30);
		n.Addition();
		
		Constr3 p = new Constr3 (2,2,2);
		p.multiplication();
		
		Constr3 r = new Constr3();
		r.Stt();
			
		
		
		
	}
	
	
	
	
	

}
