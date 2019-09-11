package if_statement;

public class Swith_Statement_class2
{

	static char c='A';
	
	public static void main(String[] args)
	{
		switch(c)
		{
		case 'A':
			System.out.println("print the A value");
			break;
			
		
		case 'B':
			System.out.println("print the B value");
			
		case 'C':
			System.out.println("print the C value");
		
		default:
			
			System.out.println("grade invalid vaule");
			
		}
	}
	
}
