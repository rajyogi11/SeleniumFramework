package StringePractice;

public class Split {
	
	public static void main (String[]arg){
		
		String a = "I love my india";
		
		String x []= a.split(" ");
		
		for(int i=0; i<=x.length-1; i++) {
			
			System.out.println(x[i]);
		}
	}

}
