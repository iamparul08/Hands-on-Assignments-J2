/*Initialize a character variable in a program and 
print 'Alphabhet' if the initialized value is an alphabhet, 
print 'Digit' if the initialized value is a number, and 
print 'Special Character', if the initialized value is anything else.*/

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println(ch + " is an alphabhet.");

        } else if(ch >= '0' && ch <= '9') {

             System.out.println(ch + " is a digit.");

        } else {

             System.out.println(ch + " is a special character.");
        }
    
    }
}