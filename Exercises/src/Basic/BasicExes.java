package Basic;

import java.util.Scanner;

public class BasicExes {
	public static void main(String args[]) {
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		int numberOne = num1.nextInt();
		int numberTwo = num2.nextInt();
		
		System.out.printf("%d%s%d%s%d", numberOne, " x ", numberTwo, " = ", numberOne*numberTwo);
		
	}
}
