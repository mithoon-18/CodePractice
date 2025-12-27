package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class CheckNullKeysAndValues {
	public static void main(String[] args) {
	//TreeMap< String, String> map = new TreeMap<String, String>();
		//no null keys are allowed,null vaules can be add
		
		//Map<String, String> map = new Hashtable<>();
		//no null keys and values are allowed
	Map<String, String> map = new ConcurrentHashMap<>();
	//no null keys and values are allowed
		
	map.put("", "A");
	map.put("", "B");
	map.put("p", "a");
	map.put("i", null);
	map.put("e", "A");
	
	System.out.println(map);
	
	
}
}
