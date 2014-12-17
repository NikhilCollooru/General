// Permute all passwords of given length and that are well ordered

import java.io.*;
import java.util.*;

public class AllPass
{
  public static void main(String args[])
  {
    int length = Integer.parseInt(args[0]);
	char all_chars[] = "1234567890".toCharArray();
	GenPass(all_chars, length, new char[length], 0);
  }
  
  private static void GenPass( char chars[], int length, char build[], int pos)
  {
    int i,j;
    if(length == pos)
	{
	  int arr[] = new int[length];
	  for(i=0; i< length; i++)
	    arr[i] = Integer.parseInt(""+build[i]);
	  if(OrdNum(arr) && arr[0]!=0)
	  {
	    StringBuffer abc = new StringBuffer();
		for(j=0; j<length; j++)
			abc.append(""+arr[j]);
		System.out.println(abc);
	  }
	  return;
	}
	
	for(i=0;i<chars.length;i++)
	{
	  build[pos] = chars[i];
	  GenPass(chars, length, build, pos+1);
	}
  }
  
  private static boolean OrdNum( int arr[])
  {
    for(int i=0; i< arr.length-1; i++)
	{
	  if(arr[i] >= arr[i+1])
	    return false;
	}
	return true;
  }
}