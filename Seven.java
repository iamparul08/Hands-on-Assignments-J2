import java.util.Scanner;
public class Seven {    
    public static void main(String[] args) {    
            
        Scanner s = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String str1 = s.nextLine();    
        StringBuffer newStr=new StringBuffer(str1);
			
            
        for(int i = 0; i < str1.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(str1.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(str1.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("Character after case conversion : " + newStr);    
    }    
}     