package arrayProgr;

public class SingleDim {
	
	public static void main(String[] args) {
		
		String ar  [] = new String [6]; //Array declaration with size
		
		
		ar[0]="Jawa";    // array initialization
		ar[1]="Automation";
		ar[2]="Manual";
		ar[3]="Sql";
		ar[4]="API";
		ar[5]="Unix";
		//ar[6]="Jira";
		//ar[7]="Maven";
		
		
		
		//System.out.println(ar[2]);
		
	System.out.println("*************print all**********");	
	
	for(int i=0; i<=5; i++) {
		
		System.out.println(ar[i]);
	}
	
	
	}

}
