import java.util.*;
import java.io.*;

public class CowBull
{
  public static void main(String args[])
  {
    String A = args[0];
	String B = args[1];
	
	int bull_count=0;
	int cow_count=0;
	
	char Aarr[] = A.toCharArray();
	char Barr[] = B.toCharArray();
	
	Map<Character, Integer> Ahash = new HashMap<Character,Integer>();
	int i;
	for( i =0; i<A.length();i++)
	  Ahash.put(Character.toLowerCase(Aarr[i]),i);
	for(i =0; i<B.length();i++)
	{
	  if (Ahash.containsKey(Character.toLowerCase(Barr[i])))
         if(Ahash.get(Character.toLowerCase(Barr[i])) == i)
			bull_count++;
	     else
	        cow_count++;
    }
	System.out.println("bull_count= "+bull_count+" cow_count= "+cow_count);
  }
}