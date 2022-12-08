package in.cms.ui;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		
		list.addFirst(50);
		list.addLast(350);
	
		for(Integer value : list) {
			System.out.println(value);
		}
		System.out.println("-".repeat(100));
		
		
	}

}
