/*Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e*/

import java.util.Scanner;

public class Four
{

public static void main(String[] args)
{
Scanner s = new Scanner ( System .in);

System.out.println("enter the first character");
char ch1=s.next().charAt(0);

System.out.println("enter the second character");
char ch2=s.next().charAt(0);

if (ch1>ch2)
System.out.println(ch2+" , "+ch1);

else
System.out.println(ch1+" , "+ch2);
}


}
