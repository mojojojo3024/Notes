//nested for loop example

public class NestedForBox
{
   public static void main(String args[])
   {
    int stop=5;  //change this value several times and rerun
        
  for(int outer=1; outer<=stop; outer++)
  {
   for(int inner=1; inner<=stop; inner++)
    System.out.print("*");
   System.out.println( );
   
   //Could you change the loops so that more asterisks are printed in each line of output, but the same number of lines are printed?
   //DO IT NOW!
   //Could you predict ahead of time how many total loops this code will go through?
  }
 }
}
