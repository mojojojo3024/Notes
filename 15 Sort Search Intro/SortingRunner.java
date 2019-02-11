import java.util.Arrays;

public class SortingRunner{
     
     public static void main(String[] args){
          
          int length = 100;    //play with the length to see how long it takes
          int[] arrayToSort = new int[length];
          
          for(int i = 0; i< length; i++){
               
               arrayToSort[i] = (int)(Math.random()*100);
          }
          
          
          YourClassHere sorter = new YourClassHere();  //change YourClassHere to your class
          
          int[] sortedArray = sorter.yourMethodHere(arrayToSort);  //fix the names
          
          System.out.println(Arrays.toString(arrayToSort));
          System.out.println(Arrays.toString(sortedArray));
          
     }
     
     
}