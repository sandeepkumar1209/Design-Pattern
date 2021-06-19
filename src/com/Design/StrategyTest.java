package com.Design;

import java.util.Scanner;

interface Strategy{
	public float calculation(float a,float b);
}

 
class Addition implements Strategy{

	@Override
	public float calculation(float a, float b) {
		return a+b;
	}	 
 }

class Substraction implements Strategy{

	@Override
	public float calculation(float a, float b) {
		return a-b;
	}	 
 }

class Multiplication implements Strategy{

	@Override
	public float calculation(float a, float b) {
		return a*b;
	}	 
 }

class Context{
	private Strategy s;
	
	public Context(Strategy s) {
		this.s=s;
	}
	
	public float executeStrategy(float num1,float num2) {
		return s.calculation(num1, num2);
	}
}



public class StrategyTest {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the number1");
		float num1=s.nextFloat();
		
		System.out.println("Enter the number2");
		float num2=s.nextFloat();
		
		
		Context c=new Context(new Addition());
		System.out.println(c.executeStrategy(num1, num2));
		
		c=new Context(new Substraction());
		System.out.println(c.executeStrategy(num1, num2));
		
		c=new Context(new Multiplication());
		System.out.println(c.executeStrategy(num1, num2));
		
		
		s.close();
		

	}

}
