package ConsTructor_Java;

public class LonDubl {
	
	long p;
	double l;
	float k;
	
	
	LonDubl ( long x, double y, float z) {
		p=x;
		l=y;
		k=z;
	}
		public void fracti() {
			
			System.out.println(p+l+k);
			
		}
			
		public static void main(String[] args) {
			
		
		LonDubl u = new LonDubl (20,20,40);
		u.fracti();


	
		}
}
