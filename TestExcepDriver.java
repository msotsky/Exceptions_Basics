import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepDriver{

	public static int divide(int n, int d){
		/*
		int result = 0;
		try{
			result = n/d;
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
		return result;
		*/
		return n/d;
	}

	public static void main(String[] args){
		
		try{
			Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter the numerator: ");
			int num = sc.nextInt();
	
			System.out.print("Enter the denominator: ");
			int denom = sc.nextInt();
	
			int result = divide(num, denom);
			System.out.println(num + " / " + denom + " = " + result);
		}catch(InputMismatchException e){
			System.out.println("Input does not match. Program ending.");
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero.");
		}
		System.out.println("Have a great day.");

						
	}
}