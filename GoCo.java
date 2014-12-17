/* 
Goldbach's conjecture : Every even integer greater than 2 can be expressed as the sum of two primes.
Write a function which takes a number as input, verify if is an even number greater than 2 and also print atleast one pair of prime numbers.
*/

import java.util.*;
import java.io.*;

public class GoCo
{
  public static void main(String args[])
  {
    int num = Integer.parseInt(args[0]);
	if(num >2)
	{
	  int i;
	  for(i=1; i < num/2;i++)
	  {
	    if(chkprime(i))
		  if(chkprime(num-i))
		    System.out.println(i+"  "+(num-i));
	  }
	}
  }
  
  private static boolean chkprime(int numb)
  {
    int max = (int)(Math.sqrt(numb));
	int i;
	for(i=2;i<=max;i++)
	{
	  if((numb%i) == 0)
	    return false;
	}
	return true;
  }
}