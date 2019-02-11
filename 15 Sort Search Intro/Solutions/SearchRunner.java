//Search algorithms

public class SearchRunner{
  
  public static void main(String[] args){
    
    
    /*
     System.out.println(obj.linear(nums, targetNumber));
     
     System.out.println(obj.binary(nums, targetNumber));
     
     System.out.println(obj.interpolation(nums, targetNumber));
     */
    double sumLinear= 0;
    double sumBinary= 0;
    double sumInterp= 0;
    int stepsLinear = 0;
    int stepsBinary = 0;
    int stepsInterp = 0;
    
    int numLoops = 100000;
    
    double linear[] = new double[2];
    double binary[] = new double[3];
    double interp[] = new double[3];
    
    for(int j = 0; j<numLoops; j++){
      
      int size = 100000;
      int biggestNum = 10000;
      int targetNumber = 500;
      int[] nums = new int[size];
      
      
      for(int i = 0; i < size; i++){                        
        nums[i] = (int)Math.floor(Math.random()*biggestNum);
        if ( nums[i] == targetNumber){
          nums[i] = 42;
        }
      }
      nums[(int)Math.floor(Math.random()*biggestNum)] = targetNumber;               
      
      Search obj = new Search();
      
      linear = obj.linear(nums, targetNumber);
      binary = obj.binary(nums, targetNumber);
      interp = obj.interpolation(nums, targetNumber);
      sumLinear += linear[0];
      sumBinary += binary[0];
      sumInterp += interp[0];
      stepsLinear += linear[1];
      stepsBinary += binary[2];
      stepsInterp += interp[2];
      
    }
    System.out.println("linear:  " + sumLinear/numLoops +" " + stepsLinear/numLoops );
    System.out.println("binary:  " + sumBinary/numLoops+ "  " + stepsBinary/numLoops);
    System.out.println("interpolation:  " + sumInterp/numLoops + "  " + stepsInterp/numLoops);
  }
}