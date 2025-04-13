
# Sum of Odd Digits - Strong Number Checker

## Description

This Java program takes an integer input from the user, calculates the sum of its odd digits, and checks whether the factorial sum of those digits (also known as a Strong Number) is equal to the original number. A Strong Number is a number in which the sum of the factorials of its digits equals the number itself.

## Example

Input: `145`  
Odd digits: `1` and `5` → Sum = 6  
Factorial sum of 6: `6! = 720`  
Since 720 ≠ 145 → Output: Not a Strong Number

## Java Code

```
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

        // Calculate the sum of odd digits
        while(temp > 0)
        {
            int ld = temp % 10;
            if(!(ld % 2 == 0))
                sum += ld;
            temp /= 10;
        }

        int strong = 0;

        // Calculate the factorial sum of the digits in the sum
        while(sum > 0)
        {
            int ld = sum % 10;
            int mul = 1;
            for(int i = 1; i <= ld; i++)
            {
                mul *= i;
            }
            strong += mul;
            sum /= 10;
        }

        // Compare the factorial sum with the original number
        if(strong == num)
            System.out.println("Sum Of Odd Digits is " + num + " Strong Number");
        else
            System.out.println("Sum Of Odd Digits is " + num + " Not a Strong Number");
    }
}
```

## How It Works

1. **User Input**: Takes an integer as input from the user.
2. **Sum of Odd Digits**: Extracts each digit, checks if it's odd, and adds it to a `sum`.
3. **Factorial Calculation**: For each digit in `sum`, calculates the factorial and accumulates the result.
4. **Strong Number Check**: Compares the factorial sum to the original number.
5. **Output**: Prints whether the number is a "Strong Number" based on the sum of its odd digits.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Sum_Of_Odd_Digits_Strong_Num_Or_Not.git
```
