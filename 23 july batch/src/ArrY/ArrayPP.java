package ArrY;

public class ArrayPP {
	
	public static void main(String[] args) {
		
	
	
	int a [] = {12,55,33,50,410,877,90,55};
	
	for(int i=0; i<=a.length-1; i++) {
		
		for(int j=i+1; j<a.length; j++) {
			
			if(a[i]==a[j]) {
				System.out.println(a[i]);
				
			}
		}
		
	}
	
	
	}
}
