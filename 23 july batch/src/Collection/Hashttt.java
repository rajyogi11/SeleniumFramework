package Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashttt {
	
	public static void main(String[] args) {
		
   Hashtable<String,Integer> tab= new Hashtable<String,Integer>();
   
   tab.put("sql", 11);  // insertion order doesn't follow
   tab.put("many", 22);
   tab.put("automate", 33);
  // tab.put("manual", null);  // Doesn't accept any key or any value as null
   
   for(Map.Entry<String ,Integer> tt : tab.entrySet() ) {
	   
	   System.out.println(tt.getKey()+" "+ tt.getValue());
   }
   
	}

}
