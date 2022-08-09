package com.qa.helloworld;

public class HelloWorld 
{	
	public static void printString(String message)
	{
		System.out.println(message);
	}
	
	public static void FizzBuzz(int input)
	{
		if (input % 3 == 0 && input % 5 == 0)
		{
			System.out.println("FizzBuzz");
		}
		else if (input % 3 == 0)
		{
			System.out.println("Fizz");
		}
		else if (input % 5 == 0)
		{
			System.out.println("Buzz");
		}
		else
		{
			System.out.println(input);
		}
	}
	
	public static void main(String[] args)
	{
		int salary = 25000;
		int tax = QAFlowcharts.Tax1(salary);
		System.out.println(tax);
		System.out.println(QAFlowcharts.Tax2(salary, tax));
		
	}
	
	


}