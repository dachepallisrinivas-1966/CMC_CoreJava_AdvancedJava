package in.cms.ui;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		set.add("oracle");
		set.add("python");
		set.add("java");
		set.add("ruby");
		set.add("c++");
		//set.add(null);
		
		System.out.println(set);
		
		System.out.println("-".repeat(100));
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
