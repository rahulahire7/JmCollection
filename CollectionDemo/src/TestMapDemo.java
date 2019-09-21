import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class TestMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> treemap=
		new TreeMap<String, Integer>();
		treemap.put("Maruti",600000);
		treemap.put("Toyota",800000);
		treemap.put("BMW",3000000);
		treemap.put("Maruti",700000);

		int i=treemap.get("BMW");
		System.out.println(i);
		System.out.println(treemap.containsKey("Maruti"));
		System.out.println(treemap.containsValue(600000));
		treemap.remove("Toyota");
		Set<String> set=treemap.keySet();
		for(String s:set){
			System.out.println("for Key "+s+" values is :"+treemap.get(s));
		}
		System.out.println();
		System.out.println("Tree Map :"+treemap);
		Map<String,Integer> hashmap=new HashMap<String, Integer>();
		hashmap.put("Maruti",600000);
		hashmap.put("Toyota",800000);
		hashmap.put("BMW",3000000);
		hashmap.put("Maruti",700000);
		System.out.println("Hash Map :"+hashmap);
	}
}
