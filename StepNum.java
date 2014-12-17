import java.util.*;
import java.io.*;

public class StepNum
{
  public static void main(String args[])
  {
    int min = Integer.parseInt(args[0]);
	int max = Integer.parseInt(args[1]);
	int i;
	for(i=min; i<=max; i++)
	{
      if(i >10)
	  {
	    if(chkstp(Integer.toString(i)))
	      System.out.println(i);
	  }
	}
  }
  
  private static boolean chkstp( String word)
  {
     char arr[] = word.toCharArray();
	  int i;
	  for(i=0;i<arr.length-1; i++)
	  {
	    if((arr[i] - arr[i+1]) != 1 && (arr[i] - arr[i+1]) != -1)
		  return false;
	  }
	  return true;
  }
}
