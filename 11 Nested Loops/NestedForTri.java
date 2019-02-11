//nested for loop example

public class NestedForTri
{
   public static void main(String args[])
   {
  //expected output:
    /*
   *
   **
   ***
   ****
   *****
   ******
   *******
   ********
   *********
  */

  int stop=9000;
  for(int outer =1; outer<= stop; outer++){       //rows
       for(int inner = 1; inner <= outer; inner++){  //columns
        
        System.out.print("*");
        
     //print out a new line
       }
       System.out.println();
  }

 }
}