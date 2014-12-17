public class FindAllPrime
{
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		for(int i=1; i<number; i++)
		{
			if(chkprime(i))
				System.out.println(i);
		}
	}
	
	private static boolean chkprime(int num)
	{
		int i =(int)(Math.sqrt(num));
		for(int j=2; j<=i;j++)
		{
			if(num%j == 0)
				return false;
		}
		return true;
	}
}