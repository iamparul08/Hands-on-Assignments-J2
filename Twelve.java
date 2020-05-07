
/* Write a program to check if a given number is prime or not.*/

import java.util.*;
public class Twelve {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = s.nextInt();
		
        boolean b = false;
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                b = true;
                break;
            }
        }

        if (!b)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}