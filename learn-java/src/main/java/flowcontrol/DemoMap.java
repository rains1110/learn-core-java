package flowcontrol;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> a = new HashMap<String,String>();
a.put("myname", " Renu");
a.put("actor"," john");
a.put("ceo", "Marisa");
a.put("actor", "Akshay");
Set<String> keys=a.keySet();
for(String key :keys) {
	System.out.println(key + " " + a.get(key));
}

	}

}
