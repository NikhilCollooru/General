/* Remove vowels from input string and print the string */
import java.util.*;

public class RemVow
{
	public static void main(String args[])
	{
		char arr[] = args[0].toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< arr.length ;i++)
		{
			if( arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u' && arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U')
				sb.append(arr[i]+"");
		}
		System.out.println(sb.toString());
	}
}
