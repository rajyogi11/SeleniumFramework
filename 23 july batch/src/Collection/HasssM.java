package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HasssM {
	
	public static void main(String[] args) {
		
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	map.put(33, null);
	map.put(33, "Sql");   /// insertion order does not follow
	map.put(33, "java");
	map.put(66, null); // put no of value is null
	map.put(44, "Sql");
	map.put(null, "Automation"); // put only one key is null
	map.put(null, null);
	map.remove(400, "Mock");
	for(Map.Entry<Integer,String> m : map.entrySet()) {
		
		System.out.println(m.getKey()+" "+ m.getValue());
	}
	System.out.println("----------------");
	
	map.put(44, "Sql");  // duplicate value not allowed 
	
for(Map.Entry<Integer,String> m : map.entrySet()) {
		
		System.out.println(m.getKey()+" "+ m.getValue());
	}

}
}