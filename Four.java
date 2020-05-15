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
