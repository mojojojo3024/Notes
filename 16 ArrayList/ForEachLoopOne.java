

import java.util.ArrayList;
import static java.lang.System.*;

public class ForEachLoopOne
{
 public static void main(String args[])
 {
  ArrayList<Integer> ray;
  ray = new ArrayList<Integer>();

  ray.add(23);
  ray.add(11);
  ray.add(66);
  ray.add(53);

  for(int num : ray)  //auto unboxing taking place
  {
     out.println(num);
  }
  
  //either type in the loop is fine
  //Java will unbox the Integer to an int when needed
  for( Integer num : ray )
  {
   out.println( num );
  }
 }
}