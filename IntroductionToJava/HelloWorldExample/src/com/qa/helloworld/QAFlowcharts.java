package com.qa.helloworld;

public class QAFlowcharts 
{
	public static int Flowcharts1(int Num1, int Num2, boolean Bool)
	{
		if (Bool == true)
		{
			return Num1+Num2;
		}
		else
		{
			return Num1*Num2;
		}
	}
	
	public static void Flowcharts2(int A)
	{
		if (A > 2000)
		{
			System.out.println("A");
			if (A > 6000)
			{
				System.out.println("C");
			}
			else
			{
				System.out.println("B");
				if (A > 4000)
				{
					System.out.println("D");
				}
				else
				{
					System.out.println("E");
				}
			}
		}
		else
		{
			System.out.println("1");
			if (A > 100)
			{
				System.out.println("3");
				if (A > 600)
				{
					System.out.println("5");
				}
				else
				{
					System.out.println("4");
					if (A > 500)
					{
						System.out.println("6");
					}
					else
					{
						System.out.println("7");
					}
				}
			}
			else
			{
				System.out.println("2");
			}
		}	
	}
	
	public static int BlackJack(int value1, int value2)
	{
		if (value1 > value2 && !(value1 > 21))
		{
			return value1;
		}
		else if (value2 <= 21)
		{
			return value2;
		}
		else if (value1 <= 21)
		{
			return value1;
		}
		return 0;
	}
	
	public static int UniqueSum(int val1, int val2, int val3)
	{
		int sum=0;
		if (val1 != val2 && val1 != val3)
		{
			sum = sum + val1;
		}
		if (val2 != val3 && val2 != val1)
		{
			sum = sum + val2;
		}
		if (val3 != val1 && val3 != val2)
		{
			sum = sum + val3; 
		}
		return sum;
	}
	
	public static int Tax1(int salary)
	{
		if (salary <= 14999)
		{
			return 0;
		}
		else if(salary >= 15000 && salary <= 19999)
		{
			return 10;
		}
		else if (salary >= 20000 && salary <= 29999)
		{
			return 15;
		}
		else if (salary >= 30000 && salary <= 44999)
		{
			return 20;
		}
		else
		{
			return 25;
		}
	}
	
	
	public static int Tax2(int salary, int tax)
	{
		return salary * (tax/100);
	}
	
}
