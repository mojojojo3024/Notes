//String length() method

import static java.lang.System.*;

public class Length
{
   public static void main( String args[] )
   {
  String s = "catcat123";
  
  System.out.println(s.length());
  
  //even a string declared in double quotes is a String object, so it has access to the methods
  System.out.println( "catcat123".length() ) ;  
  
  
 }
}