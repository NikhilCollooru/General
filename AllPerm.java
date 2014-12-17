//Prints all possible words for a given word length 

import java.io.*;
import java.util.*;

public class AllPerm
{
  public static void main(String args[])
  {
    int length = Integer.parseInt(args[0]);
	char all_chars[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	printAllPerm(all_chars, length, new char[length], 0);
  }
  
  private static void printAllPerm(char chars[], int len, char finale[], int pos)
  {
    if(pos == len)
	{
	  StringBuffer abc = new StringBuffer();
	  for(int i=0; i<len;i++)
	    abc.append(finale[i]);
	  System.out.println(abc);
	}
	else
	{
	 for(int j=0; j<chars.length; j++)
	 {
	   finale[pos] = chars[j];
	   printAllPerm(chars, len, finale, pos+1);
	 }
	}
  }
}