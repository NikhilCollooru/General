import java.util.Scanner;

public class Mergesort{
  public static void main( String args[])
  {
    int[] numbers = readNumbers();

	int count = numbers.length;
	numbers = sort(numbers,0,count-1);
	for( int i=0 ; i < numbers.length ; i++)
	  System.out.println(numbers[i]);
  }
  
  public static int[] sort( int[] numbers ,int start,int end)
  {
    if( start == end)
	  return numbers;
	int mid;  
	mid = (start+end)/2;
	int L[], R[] ;
	L = sort(numbers,start,mid);
	R = sort( numbers, mid+1, end);
	int newset[];
	newset = Merge(L,R);
	return newset;
  }
  
  public static int[] Merge(int[] left, int[] right)
  {
    int i=0,j=0,k;
	int count = left.length + right.length;
	int ful[] = new int[count];
	for( k = 0 ; k< count; k++)
	{
	  if(left[i] <= right[j])
	  {
	    ful[k] = left[i];
		i++;
	  }
	  else 
	  {
	    ful[k] = right[j];
		j++;
	  }
	}
    return ful;	
  }
  
   public static int[] readNumbers()
  {  
    Scanner s = new Scanner(System.in);
	int count = s.nextInt();
	s.nextLine();
	Scanner newS = new Scanner(s.nextLine());
	int[] numbers = new int[count];
	for (int i=0; i<count;i++)
	{
	 if(newS.hasNextInt())
	   numbers[i] = newS.nextInt();
	 else
	   System.out.println("enough numbers not given");
	}
	
	return numbers;
   }
   }
	