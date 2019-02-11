//Array instance variable example

import java.util.Scanner;
import static java.lang.System.*;

public class ArrayIVars
{
 private int[] nums;

   public ArrayIVars()
   {
        nums = new int[10];
   }

 public void work()
 {
    for(int i=0; i<nums.length;i++)
    {
       nums[i] = i*3+4*2;
    }
 }

 public String toString()
 {
      String catsAreGreat = "";
      for(int item : nums){
           catsAreGreat += item + " ";
      }
  return catsAreGreat;
 }


 public static void main(String args[])
 {
  ArrayIVars test = new ArrayIVars();
  test.work();
  out.println(test);
  
  //output
  /*
   8 11 14 17 20 23 26 29 32 35
  */
 }
}
