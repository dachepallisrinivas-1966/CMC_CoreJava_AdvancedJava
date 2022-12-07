package in.cms.ui;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter first number: ");
			int firstNumber = scan.nextInt();
			System.out.print("Enter second number: ");
			int secondNumber = scan.nextInt();
			int result;
			
			result = firstNumber + secondNumber;
			System.out.println("Sum = " + result);
			
			try {
				int[] arr = {10,20};
				System.out.println(arr[2]);
				
				String str = "java";
				System.out.println(str.charAt(10));

				result = firstNumber / secondNumber;
				System.out.println("Quotient = " + result);
			}
			catch(ArithmeticException excep) {
				System.out.println("Cannot Divide by ZERO");
			} 
			catch(StringIndexOutOfBoundsException excep) {
				System.out.println("There is no such position in the string");
			}
			finally {
				System.out.println("OVER");
			}
			result = firstNumber * secondNumber;
			System.out.println("Product = " + result);
			
		} catch(InputMismatchException excep) {
			System.out.println("please input integers only");
		}
		
		scan.close();
	}

}
