// Given 2 numbers and the number of digits in them 
// return equal if the digits are the same in both the numbers 

import java.io.*;
import java.util.*;

public class Chk_epic
{
  public static void main(String[] args)
  {
    int f_num = Integer.parseInt(args[0]);
	int s_num = Integer.parseInt(args[1]);
	int d_count = Integer.parseInt(args[2]);
	
	int i;
	int f_sum = 0;
	int s_sum=0;
	
	for (i=0; i<d_count; i++)
	{
	  f_sum = f_sum + f_num%10;
	  s_sum = s_sum + s_num%10;
	  f_num = f_num/10;
	  s_num = s_num/10;
	}
	
	if(f_sum == s_sum)
		System.out.println("equal");
	else
		System.out.println("not equal");
  }
}
