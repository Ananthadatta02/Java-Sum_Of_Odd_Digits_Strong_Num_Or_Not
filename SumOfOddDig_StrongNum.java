package test_02_04_25;

import java.util.Scanner;

public class SumOfOddDig_StrongNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int sum = 0;
		int temp = num;
		while(temp>0)
		{
			int ld = temp%10;
			if(!(ld%2==0))
				sum += ld;
			temp/=10;
		}
		int strong = 0;
		while(sum>0)
		{
			int ld = sum%10;
			int mul = 1;
			for(int i=1;i<=ld;i++)
			{
				mul *= i;
			}
			strong += mul;
			sum/=10;
		}
		if(strong==num)
			System.out.println("Sum Of Odd Digits is " + num + " Strong Number");
		else
			System.out.println("Sum Of Odd Digits is " + num + " Not a Strong Number");
	}
}
