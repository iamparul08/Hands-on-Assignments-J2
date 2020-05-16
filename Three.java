/* if the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

Example1) java Example
O/P: No values

Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore

[Hint: You can use length property of an array to check its length]
If Statement	*/

 import java.util.Scanner;
 class Three {
	 public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter any two values- ");
		 String s1 = s.nextLine();
		 String s2 = s.nextLine();
		 
		 int k1 = s1.length();
		 int k2 = s2.length();
		 
		 if(k1==0 && k2==0) {
			 System.out.println("No values");
		 }
		 else {
			 
				System.out.println(s1 + " , " + s2);
			 
		 }
		 
	 }
 }