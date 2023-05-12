package Collection;

public class Generics <R>{
	
	int a;
	R b;
	
	
	public static void main(String[] args) {
		
		Generics<Integer> g  = new Generics<Integer>();
		g.b=55;
		g.a=44;
		System.out.println(g.a+" "+g.b);
		
		Generics<String> f = new Generics<String>();
		
		f.b="Mahesh";
		
		System.out.println(f.b);
		
		Generics<Float> t = new Generics<Float>();
		
		t.b=10.4f;
		
		System.out.println(t.b);
		
	}

}
