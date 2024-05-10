
public class FinallyClause 
{
	public static void main(String[] args) 
	{
		try
		{
			// int val=0; // statement 1
			//int  a=100/val ; //Statement 2
			int[]x=new  int[-5]; 	// statement 3
			System.out.println("No output");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e);
		}
		finally
		{
			System.out.println("Program end");
			System.out.println("Bye Bye...");
			System.out.println("See you soon...");
		}
	}
}
