package in.cms.ui;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("oracle", 45);
		map.put("java se",30);
		map.put("java ee",30);
		map.put("oracle", 55);
		map.put("python", 32);
		map.put("aws", 70);
		map.put("devops", 40);
		
		for(String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}

	}

}
 