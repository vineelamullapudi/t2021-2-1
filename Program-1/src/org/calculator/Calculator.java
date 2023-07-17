package org.calculator;

import java.util.Scanner;

public class Calculator {
	
	public void calculate(){
		Scanner sc=new Scanner(System.in);
		double result;
		double a;
		double b;
		
		System.out.println("please enter the t7pe of operation you wanted to perform");
		String operation=sc.next();
		System.out.println("please enter the valus of first operant i.e a");
		a=sc.nextDouble();
		System.out.println("please enter the value of second operand i.e b");
		b=sc.nextDouble();
		
		
		switch(operation){
		case "addition":
			result=a+b;
			break;
		case "subtraction":
		result=a-b;
		break;
		
		case "multiplication":
			result=a*b;
			break;
			
		case "division":
			if(b!=0) {
				result=a/b;
			}else {
				throw new IllegalArgumentException("cannot divide by zero");
			}
			break;
			default: throw new IllegalArgumentException("Invalid Operation"+operation);
				
		}
		System.out.println("Result="+result);

	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.calculate();
				

	}

}
