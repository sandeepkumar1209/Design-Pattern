package com.Design;

interface A{
	
	//public int sum(int p,int q);
	//public void sum(int p,int q);

	public int getTax(double salary);
}


public class LambdaExpressionTest {

	public static void main(String[] args) {
		
		//For return type method
		
		/*A a= (p,q)-> p+q;
		System.out.println(a.sum(1,2));*/
		
		//For non return type
		/*
		A a= (p,q) ->System.out.println("Sum is :"+(p+q));
		a.sum(1, 2);
		*/
		
		A a=(salary)->{
			if(salary>5000) {
				return (int) (.10*salary);
			}
			else
				return 0;
		};
		
		System.out.println(a.getTax(10000));

	}

}
