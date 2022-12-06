package in.cms.ui;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = scanner.next();
		
		String rev = "";
		for(int index = str.length() - 1; index >= 0; index--) {
			rev += str.charAt(index);
		}
		
		System.out.println("Reverse String = " + rev);
	}

}
