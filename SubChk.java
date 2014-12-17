// Given two strings str1 and str2 , we have to check if str2 is a
// subsequence of str1

import java.io.*;
import java.util.*;

public class SubChk
{
  public static void main(String[] args)
  {
    if (args.length != 2)
	  System.out.println("please enter 2 strings");
	
	String str1 = args[0];
	String str2 = args[1];
	
	char[] str1_a = str1.toCharArray();
	char[] str2_a = str2.toCharArray();
	
	
	int i=0, j=0;
	int size = str2_a.length;
	if ( str1.contains(str2))
		 System.out.println("Yes");
	 else
		 System.out.println("No");	  
	// for(i=0; i<str1_a.length; i++)
	// {
      // if(str1_a[i] == str2_a[j])
		// j++;
	// }
	// if (j== size)
		// System.out.println("Yes");
	// else
		// System.out.println("No");
  }
}