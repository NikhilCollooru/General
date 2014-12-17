/* Print the string having the first letter of all the words in input string */
import java.io.*;
import java.util.*;

public class FirstLetter
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] tokens = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for( String word:tokens)
			sb.append(word.charAt(0)+"");
		System.out.println(sb.toString());
	}
}