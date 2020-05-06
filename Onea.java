/* A) Write a program to check if a given integer number is Positive, Negative, or Zero. */

import java.util.*;
class Onea{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int i = s.nextInt();
		
		if(i>0){
			System.out.println("Number is positive.");
		}
		else if(i<0){
			System.out.println("Number is negative.");
		}
		else 
			System.out.println("Number is zero.");
	}
}