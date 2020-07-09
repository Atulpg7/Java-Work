package vivek;

import java.util.HashMap;
import java.util.Map;

class Temp {
	
	public void HashMapCQ1(HashMap<String, String> map) 
	{
	 HashMap<String, String> out = new HashMap<String, String>();
	 for (String k : map.keySet()) 
	 {
	  String v = map.get(k);
	  if (k.charAt(0) <= v.charAt(0)) 
		  out.put(k, v);
	  else 
		  out.put(v, k);
	 }
	 System.out.println(out);
	}


	    public static void main(String args[]){
	    	
	    	Map<String, String> map=new HashMap<>();
	    	
	    	map.put("two","deux");
	    	map.put("five","cinq");
	    	map.put("one","un");
	    	map.put("three","trois");
	    	map.put("four","quatre");
	    	
	 }
}