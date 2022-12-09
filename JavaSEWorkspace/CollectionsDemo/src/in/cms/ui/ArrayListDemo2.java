package in.cms.ui;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(200);
		list.add(75);
		list.add(16);
		
		Collections.sort(list);
		
		System.out.println(list);
		
//		System.out.println("-".repeat(100));
//		
//		for(int index = 0; index < list.size(); index++) {
//			System.out.println(list.get(index));
//		}
//		System.out.println("-".repeat(100));
//		
//		for(Integer value : list) {
//			System.out.println(value);
//		}
//		System.out.println("-".repeat(100));
//		
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println("-".repeat(100));
	}

}
