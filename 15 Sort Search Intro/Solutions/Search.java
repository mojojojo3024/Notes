//insert the correct algorithm for a linear and binary search.  You should return the index of the target.  Set output = index of target
import java.util.Arrays;

public class Search{
  private double startTime;
  private double elapsedTime;
  
  public double[] linear(int[] arrayIn, int target){
    double[] output = new double[2];
    startTime = System.nanoTime();  //will use this to calculate runtime
    
    for(int i = 0; i<arrayIn.length; i++){
      if(arrayIn[i] == target){
        output[1] = i;
        break;
      }
    }
    
    elapsedTime = (System.nanoTime() - startTime)/1E9;  // dividing by 1E9 converts nanoseconds to seconds
    output[0] = elapsedTime;
    return output;
    
  }
  
  public double[] binary(int[] arrayIn, int input){
    double[] output = new double[3];
    
    
    Arrays.sort(arrayIn);
    
    startTime = System.nanoTime();  //will use this to calculate runtime
    
    int start = 0;
    int end = arrayIn.length - 1;
    int count = 0;
    while (start <= end) {
      count++;
      int mid = (start + end) / 2;  //always "rounds down"
      if (input == arrayIn[mid]) {
        output[1] = mid;
        output[2] = count;
        break;
      }
      if (input < arrayIn[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    elapsedTime = (System.nanoTime() - startTime)/1E9;  // dividing by 1E9 converts nanoseconds to seconds
    
    output[0] = elapsedTime;
    return output;
  }
  
  public double[] interpolation(int[] arrayIn, int input){
    double[] output = new double[3];
    Arrays.sort(arrayIn);
    
    startTime = System.nanoTime();  //will use this to calculate runtime
    
    int indexLow = 0;
    int indexHigh = arrayIn.length-1;
    int min = arrayIn[indexLow];
    int max = arrayIn[indexHigh];
    int lookAt;
    int count = 0;
    
    while(indexLow <= indexHigh){
      count++;
      lookAt = indexLow + (int)((double)(input - min)/(max - min)*(indexHigh - indexLow));
      
      if(input == arrayIn[lookAt]){
        output[1] = lookAt;
        output[2] = count;
        break;
      }
      if(input < arrayIn[lookAt]){
        indexHigh = lookAt-1;
        max = arrayIn[indexHigh];
        
        
      } else{
        indexLow = lookAt+1;
        min = arrayIn[indexLow]; 
      }
      
    }
    
    elapsedTime = (System.nanoTime() - startTime)/1E9;  // dividing by 1E9 converts nanoseconds to seconds
    
    output[0] = elapsedTime;
    return output;
  }
  
}