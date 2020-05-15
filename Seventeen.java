import java.util.Scanner;
class Seventeen {
	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int num, reversedInteger = 0, remainder, originalInteger;
		System.out.println("Enter any number: ");
		num = s.nextInt();
        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}