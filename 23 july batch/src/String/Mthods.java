package String;

public class Mthods {
	
	
	public static void main(String[] args) {
		
	
          String s1 = new String("a"); // because object are create in the non constant pool area
          String s2 = new String("a"); // duplicate object create 
          String s8 = "A";
          System.out.println(s1==s2); // 
          
          String s3 = new String("a");  // only string data are compaire
          String s4 = new String("a");
          
          System.out.println(s3.equals(s8));  // compare only data without its cases

	System.out.println(s3.equalsIgnoreCase(s8));
	
	
	
	
	}	
	
}

