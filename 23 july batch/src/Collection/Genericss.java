package Collection;

public class Genericss<R,K,L,O> {
	
	R b;
	K m;
	L c;
	O p;
	
//	K test(L s) {
//		return m;
		
		
//	}
	
	public static void main(String[] args) {
		
Genericss<String,Float,Integer,Character> h = new Genericss<String,Float,Integer,Character>();

h.b="SQL";
h.m=45.f;
h.c=66;
h.p='@';

System.out.println(h.b+" "+h.m+" "+h.c+" "+h.p);
		
	}

}
