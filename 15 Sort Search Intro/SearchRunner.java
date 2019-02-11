//Search algorithms

public class SearchRunner{
     
     public static void main(String[] args){
      
          int[] nums = new int[1000000];
          for(int i = 0; i < 1000000; i++){                        //this creates a 1,000,000 length array with random integers from 0-10,000
               nums[i] = (int)Math.floor(Math.random()*10000);
          }
          nums[(int)Math.floor(Math.random()*100000)] = 42;               //makes sure that 42 is somewhere random in the array at least once
          
          Search obj = new Search();
          System.out.println(obj.linear(nums, 42));
          
          //obj.binary(nums, 42);
     
     
     }
}

Arrays.sort(nums);