//array count example

import static java.lang.System.*;

public class ArrayCount
{
 /*
  * countIt should return a count that
  * states how many times val exists
  * in the array iRay
  */
 public static int countIt( int[] iRay, int val )
 {
      int count = 0;
      for(int cats : iRay){
           if(cats == val)
                count++;
      }
  return count;
 }

 public static void printIt( int[] iRay  )
 {
  for(int item : iRay)
  {
   out.print(item + " ");
  }
 }

 public static void main(String[] args)
 {
  int[] nums = {7,7,1,7,8,7,4,3,7, 9,8};

  printIt( nums );
  System.out.println("\ncount of 0s == " + countIt( nums, 0 ));
 }
}