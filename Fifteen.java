
import java.util.Scanner;
class Fifteen
{
    public static void main(String args[])
    {
       int rows, number = 1, counter, j;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of rows for floyd's triangle:");
       
       rows = input.nextInt();
       System.out.println("Floyd's triangle");
       
       for ( counter = 1 ; counter <= rows ; counter++ )
       {
           for ( j = 1 ; j <= counter ; j++ )
           {
                System.out.print("*");
                //Incrementing the number value
                number++;
           }
           //For new line
           System.out.println();
       }
   }
}