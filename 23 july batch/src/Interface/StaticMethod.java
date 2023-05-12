package Interface;

public class StaticMethod implements MethodsStat  {//implements from MethodStat
	
	
	
	public void Display () { // method from interface is completed
		
		System.out.println("Non Static Method are Running");
	}
	
	
	
	public static void main(String[] args) {
		
		StaticMethod x = new StaticMethod(); // object for interface 
		x.Display();
		MethodsStat.show(); // static method calling using interface name dot static method name
		
		
		
		
	}

}
