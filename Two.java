//WAP to check whether the given number is even or odd

import java.util.*;
class Two
{
	public static void main(String args[])
	{
		System.out.println("Enter any integer number: ");
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();
		if(s1 % 2 == 0){
			System.out.println("Number is even.");
		}
		else
			System.out.println("Number is odd.");
	}
}