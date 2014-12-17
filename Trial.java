import java.io.*;
import java.util.*;

public class Trial
{
  public static void main(String args[])
  {
     String config = args[0];
	 String op = args[1];
	 System.out.println(move(config,op.charAt(0)));
	// int modeFlag = Integer.parseInt(args[1]);
    // char config_arr[] = config.toCharArray();
	// //	int blk_num[] = new int[8];
		// int[] blk_num = {6,7,8,11,12,15,16,17};
		// int n1=0,n2=0,n3=0;
		// for(int i : blk_num)
		// {
		  // if( config_arr[i] == '1')
		    // n1++;
		  // else if( config_arr[i] == '2')
		    // n2++;
		  // else 
            // n3++;		  
		// }
		
		// if(modeFlag == 1)
		  // System.out.println( 8- Math.max(n1,Math.max(n2,n3)));
		// else if(modeFlag == 2)
		  // System.out.println(0);
  }
  	private static String move(String config, char op) {
		// TODO Add your code here
		if( op >= 'A' && op < 'I')
		{
		  char config_arr[] = config.toCharArray();
		  int[][] rotations = new int[][]{
		   {2,1,6,3,4,5,11,7,8,9,10,15,12,13,14,20,16,17,18,19,22,21,0,23},
		   {0,3,2,8,4,5,6,7,12,9,10,11,17,12,14,15,16,21,18,19,20,23,22,1},
		   {0,1,2,3,10,4,5,6,7,8,9,11,12,13,14,15,11,17,18,19,20,21,22,23},
		   {0,1,2,3,4,5,6,7,8,9,10,11,12,19,13,14,15,16,17,18,20,21,22,23},
		   {0,23,2,1,4,5,6,7,3,9,10,11,8,13,14,15,16,12,18,19,20,17,22,21},
		   {22,1,0,3,4,5,2,7,8,9,10,6,12,13,14,11,16,17,18,19,15,21,20,23},
		   {0,1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,13,20,21,22,23},
		   {0,1,2,3,5,6,7,8,9,10,4,11,12,13,14,15,16,17,18,19,20,21,22,23}
		  };
		
		  int num = op -'A';
		  StringBuffer output_str = new StringBuffer();
		  for(int i:rotations[num])
		    output_str.append(config_arr[i]);
		  return output_str.toString();
		}
		else
		  return null;
	}
}