package String;

public class Split {
	public static void main(String[] args) {
		
		String a = "Sachin is Tester Of Jawa";
		String e = "12/05/2022";
		
		
		String []  b = a.split("a"); // Array method use for string
		String [] c = a.split(" ");
		String [] d = e.split("/");
		
		for (int i =0; i<b.length; i++) {
			
			System.out.println(b[i]);
		}
		
		for (int j=0; j<c.length; j++) {
		
		System.out.println(c[j]);
		}
		for (int l=0; l<d.length; l++) {
			
			System.out.println(d[l]);
		}
		

		
	}

}
