// Write a java program to work with Finally block.
public class Demo_1
{
	public static void main(String[] args) 
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("Result = "+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Hello Mr.Satish");
		}
	}
}
