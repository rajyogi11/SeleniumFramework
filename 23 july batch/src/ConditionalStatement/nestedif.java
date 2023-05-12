package ConditionalStatement;

public class nestedif {
	

public static void main (String[] args) { 

	String UN= "12";
	String PWD= "45";
	
	if (UN=="12") {
		System.out.println("Number is correct");
		System.out.println("procced next");
		
	if (PWD=="45") {
		System.out.println("Number is correct");
		System.out.println("Proceed forword");
	}
	else {
		System.out.println("Number is incorrect");
		System.out.println("Doesnt proceed");
	}
	}
	else {
		System.out.println("Number is not correct");
		System.out.println("Doesnot not proceed forword");
	}
			
	
}}
