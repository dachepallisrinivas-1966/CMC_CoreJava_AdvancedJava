package in.cms.ui;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a positive number:" );
		int num = scan.nextInt();
		
		if (num > 0)
			System.out.println(num);
		else
			System.err.println(num + " is invalid.");

	}

}
