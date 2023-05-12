package Programs40;

public class DuplicateArrayInArrayList {
	
	public static void main(String[] args) {  // duplicate array in list
		
		int vr []= {12,88,20,45,66,88,25,20,66,14,10,25};
		
		for(int i=0; i<=vr.length-1; i++) {
			
			for(int j=i+1; j<vr.length; j++) {
				
				if((vr[i]==vr[j])) {
					
					System.out.println(vr[i]);
				}
			}
		}
		
		
	}

}
