package in.cms.ui;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(150);
		list.add(2.5);
		list.add("srinivas");
		list.add(false);
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());

		list.add(3, 333);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.contains(200));
		
		list.set(0, 222);
		System.out.println(list);
		
	}

}
