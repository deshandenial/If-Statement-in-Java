package if_statement;

public class If_Else_If_Statement 
{
	 // declare the data type variable
	static int x=20;
	static int y=30;
	public static void main(String[] args) 
	{
		// boolean condition declared When x value satisfy print the statement otherwise go to second if statement
		if(x==30)
		{
			System.out.println("print the first check:"+x);
			
		}
		// boolean condition declared When y value satisfy print the statement otherwise go to third statement
		else if(y==40)
		{
			System.out.println("print the second check:"+y);
		}else if(x==20 && y==30)
		{
			System.out.println("print the third check x value:"+x);
			System.out.println("print the third check y value:"+y);
		}else {
			System.out.println("print the default block");
		}
			
		
	}
	

}
