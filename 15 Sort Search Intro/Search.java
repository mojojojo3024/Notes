//insert the correct algorithm for a linear and binary search.  You should return the index of the target.  
// Example:  You've found that the target is at index 50.  output += 50 should be in the code you write.
//Do not alter any of the existing lines.

public class Search{
     private startTime;
     private elapsedTime;
     
     public static String linear(int[] arrayIn, int target){
          String output = "";
          startTime = System.currentTimeMillis();  //will use this to calculate runtime
          
          //Put the algorithm here
          //Put the algorithm here
          //Put the algorithm here
          
          elapsedTime = (System.nanoTime() - startTime)/1E9  // dividing by 1000 converts milliseconds to seconds
          output += "  elapsed time: " + elapsedTime;
          return output;
     }
     
     public static String binary(int[] arrayIn, int input){
          String output = "";
          startTime = System.nanoTime();
          
          //Put the algorithm here
          //Put the algorithm here
          //Put the algorithm here
          
          elapsedTime = (System.nanoTime() - startTime)/1E9  // dividing by 1000 converts milliseconds to seconds
          output += "  elapsed time: " + elapsedTime;
          return output;  
     }
     
     
     
}