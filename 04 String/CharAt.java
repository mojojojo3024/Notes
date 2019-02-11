//String charAt() method

import static java.lang.System.*;

public class CharAt
{
   public static void main( String args[] )
   {
  String s = "catcat!";

  out.print(s.charAt(0) + " ");
  out.print(s.charAt(2) + " ");
  out.println(s.charAt(6));
  out.println(s.substring(5,2));
  
  
  //out.println( s.charAt(7) );  //uncomment this line to get yelled at by the compiler.  What's wrong?
 }
}