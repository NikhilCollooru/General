// Find the maximum subarray of min size 2 from a given array of numbers

import java.util.*;
import java.io.*;

public class MaxSub
{
  public static void main(String args[])
  {
    int arr[] = {-1,-1,-10,6,-10};
	int i,j,k,sum=0;
	int start=0, end=0, max=-9999;
	for(i=1; i<arr.length ; i++)
	{
	  for(j=0;j<=i; j++)
	  {
	    sum=0;
	    for(k=j;k<=i;k++)
		{
		  sum = sum + arr[k];
		}
		if( sum >max && (i-j)>=1)
		{
		  max=sum;
		  start=j+1;
		  end=i+1;
		}
	  }
	}
	System.out.println("Sum="+max+" start_position="+start+" end_position="+end);
	int f='aa';
	int g = 'bb';
	int y=f-g;
	System.out.println(y);
  }
}