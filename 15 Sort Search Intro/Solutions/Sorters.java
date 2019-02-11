import java.util.Arrays;

public class Sorters{
     
     public int[] bogo(int[] arrayIn){
          
          int[] output = new int[arrayIn.length];
          
          
          int attempts = 0;
          boolean isSorted = false;
          double startTime = System.nanoTime();
          double elapsedTime = 0;
          
          for(int i = 0; i < arrayIn.length; i++){
               output[i] = arrayIn[i];
          }
          
          
          do{
               
          for(int i = 0; i< output.length; i++){
            
               swap(output, i, (int)(Math.random()*output.length));

          }
          
          
          for(int i = 1; i<output.length; i++){
               
               if( output[i-1] > output[i]){
                    isSorted = false;
                    break;
               } else
                  isSorted = true;
          }
          attempts++;
         
          } while(!isSorted);
          elapsedTime = (System.nanoTime()-startTime)*1E-9;
          System.out.println("time=   " + elapsedTime + " seconds");
          System.out.println("attempts= "+attempts); 
          System.out.println("attempts/second=  "+ attempts/elapsedTime);
          return output;
          
     }
     
     public void swap(int[] input,int firstIndex,int secondIndex){
          int temp = input[firstIndex];
          input[firstIndex] = input[secondIndex];
          input[secondIndex] = temp;
     }
     
     
}