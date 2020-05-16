class Eight
{
	public static void main(String args[])
	{
		char choice;
		System.out.println("Select your choice: ");
		System.out.println("	R");
		System.out.println("	Y");
		System.out.println("	W");
		System.out.println("	G");
		System.out.println("	B");
		System.out.println("	O");
		
		System.out.print("Choice:- ");
		
		try
		{
			switch(choice = (char)System.in.read())
			{	
				case 'R' :
				case 'r' :	System.out.println("Red");
							break;
					   
				case 'Y' :
				case 'y' :	System.out.println("Yellow");
							break;
				
				case 'W' : 
				case 'w' :	System.out.println("White");
							break;
							
				case 'G' : 
				case 'g' :	System.out.println("Green");
							break;
							
				case 'B' : 
				case 'b' :	System.out.println("Blue");
							break;
							
				case 'O' : 
				case 'o' :	System.out.println("Orange");
							break;
							
				default : System.out.println("Invalid Code (IC)");			   
						
			}
		}
		catch (Exception e)
		{
			System.out.println("I/O Error");
		}
	}
}