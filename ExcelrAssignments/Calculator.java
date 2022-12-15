package ExcelrAssignments;

import java.util.Scanner;

public class Calculator {
	
	int num1;
	int num2;
    int c;
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
    	System.out.println("  !! Welcome !!  ");

		
		Calculator obj = new Calculator();
		
		obj.calculator(sc);
		
	}
    void calculator(Scanner sc) {
    	
    	System.out.println("Enter a First number");
    	
    	 num1 = sc.nextInt();
    	
		System.out.println("Enter a Second number");

		 num2 = sc.nextInt();
		
		System.out.println("Which Operation you want to do");
		
		System.out.println();
		
		System.out.println("1.Adddition");
		
		System.out.println("2.Substaction");
		
		System.out.println("3.Multiplication");
		
		System.out.println("4.Division");
		
		System.out.println("Enter Your Option");
		
		int opt = sc.nextInt();
		
	    Calculator obj = new Calculator();
		
		switch(opt) {
		
		case 1: c=num1+num2;
		
		System.out.println("The Addition is "+c);
		
		System.out.println();
        obj.calculator(sc);

		
		
		break;
		
		
		case 2: c=num1-num2;
		
		System.out.println("The Substaction is "+c);
		
        System.out.println();
        obj.calculator(sc);

		
		break;
		
        case 3: c=num1*num2;
		
		System.out.println("The Multiplication is "+c);

        System.out.println();
		obj.calculator(sc);
		
		
		
		break;
		
        case 4: c=num1/num2;

        System.out.println("The Division is "+c);
        
        System.out.println();
		obj.calculator(sc);
		
        break;
        
		}
    	
    }
}
