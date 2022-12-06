package in.cms.ui;

import in.cms.service.BubbleSortingImpl;
import in.cms.service.Sorting;

public class InterfaceApp {

	public static void main(String[] args) {
		int[] array = {50,40,30,20,15,10};
		
		Sorting sortingRef;
		// sortingRef = new LinearSortingImpl();
		sortingRef = new BubbleSortingImpl();
		sortingRef.sort(array);
	}

}
