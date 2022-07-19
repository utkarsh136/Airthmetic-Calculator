package calculator;//creating an airthmetic calculator

import java.util.Scanner;

public class calculators {

	public static void main(String[] args) {
		
		char operation;
		double firstnumber;
		double secondnumber;
		double result=0.0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose a operation:1+, 2-, 3* 4/, 5%, 6^ "  );//a total of six operation can be done
		operation=sc.next().charAt(0);
		
		System.out.print("Enter the  first number");
		firstnumber=sc.nextDouble();
		System.out.print("Enter the  second number");
		secondnumber=sc.nextDouble();
		switch(operation) {
		case '+':
			result=firstnumber+secondnumber;
			System.out.println(firstnumber + " + " + secondnumber + " = " + result);
			break;
		case '-':
			result=firstnumber-secondnumber;
			System.out.println(firstnumber + " - " + secondnumber + " = " + result);
			break;
		case '*':
			result=firstnumber*secondnumber;
			System.out.println(firstnumber + " * " + secondnumber + " = " + result);
			break;
		case '/':
			result=firstnumber/secondnumber;
			System.out.println(firstnumber + " / " + secondnumber + " = " + result);
			break;
		case '%':
			result=firstnumber%secondnumber;
			System.out.println(firstnumber + " % " + secondnumber + " = " + result);
			break;
		
		case '^':
			result=Math.pow(firstnumber, secondnumber);
			System.out.println(firstnumber + " ^ " + secondnumber + " = " + result);
			break;
	
		
	
	
		default:
			System.out.println("Invalid operation!");
			break;
		
		}
		
		sc.close(); 
		
		
		
		


	}

}
