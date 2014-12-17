import java.util.*;

public class Substr
{
	public static void main(String args[])
	{
		String str1 = args[0];
		String str2 = args[1];
		
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str1);
		if(sb.toString().toLowerCase().contains(str2.toLowerCase()))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}