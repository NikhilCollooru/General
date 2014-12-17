import java.util.*;
import java.io.*;

public class Ana
{
  public static void main( String args[])
  {
    printAna("",args[0]); 
  }
  
  private static void printAna(String prefix, String word)
  {
    if(word.length() == 1)
	{
	  //System.out.println(prefix+word);
	  if(ChkifOrd(prefix+word))
	    System.out.println(prefix+word);
	}
	else
	{
	  printAna(prefix+word.charAt(0), word.substring(1));
	  for(int i=1; i<= word.length()-2; i++)
	     printAna(prefix+word.charAt(i), word.substring(0,i)+ word.substring(i+1));
	  printAna(prefix+word.charAt(word.length()-1), word.substring(0,word.length()-1));
	}
  }
  
  private static boolean ChkifOrd(String abc)
  {
    String word = abc.toLowerCase();
	char arr[] = word.toCharArray();
	int i;
	for( i=0; i<word.length()-1 ; i++)
	{
	  if(arr[i] > arr[i+1])
	    return false;
	}
	return true;
  }
}
