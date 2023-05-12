package String;

public class SubString {
	
	public static void main(String[] args) {
		
		String a = "Sachin";
		String b = "Smiles";
		
		System.out.println(a.substring(2));
		System.out.println(a.substring(3));
		System.out.println(b.substring(0, 4));
		System.out.println(b.substring(1, 5));
		System.out.println(b.subSequence(0, 6));
	}

}
