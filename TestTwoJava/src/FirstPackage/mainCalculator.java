package FirstPackage;
import java.util.*;

import OpertaionsPackage.sumNumbers;
import OpertaionsPackage.divideNumbers;
import OpertaionsPackage.multiplyNumbers;
import OpertaionsPackage.restNumbers;

public class mainCalculator{
	
	public static void main(String args[]) {
		menu();
	}
	
	public static void menu() {
		System.out.println("Elige una operacion");
		System.out.println("1.- Suma \n 2.- Resta \n 3.- Multiplicacion \n 4.- Division");
		Scanner operacion = new Scanner(System.in);
		int operation = operacion.nextInt();
		switch(operation){
			case 1: suma();
					break;
					
			case 2: resta();
					break;
			
			case 3: multiplica();
					break;
				
			case 4: divide();
					break;
		}
		System.out.println("Done");
	}
	
	public static void suma(){
		Scanner num = new Scanner(System.in);
		int num1, num2;
		num1 = num.nextInt();
		num2 = num.nextInt();
		
		System.out.println(sumNumbers.sumarNumeros(num1, num2));
	}
	public static void resta() {
		Scanner num = new Scanner(System.in);
		int num1, num2;
		num1 = num.nextInt();
		num2 = num.nextInt();
		
		System.out.println(restNumbers.restarNumeros(num1, num2));
	}
	public static void multiplica() {
		Scanner num = new Scanner(System.in);
		int num1, num2;
		num1 = num.nextInt();
		num2 = num.nextInt();
		
		System.out.println(multiplyNumbers.multiplicarNumeros(num1, num2));
	}
	public static void divide() {
		Scanner num = new Scanner(System.in);
		int num1, num2;
		num1 = num.nextInt();
		num2 = num.nextInt();
		
		System.out.println(divideNumbers.dividirNumeros(num1, num2));
	}
}
