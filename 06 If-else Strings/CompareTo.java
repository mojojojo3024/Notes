//String compareTo() method

import static java.lang.System.*;

public class CompareTo
{
   public static void main( String args[] )
   {
  String one = "region";
  String two = "unicorns";

  out.println(one.compareTo(two));
  out.println(two.compareTo(one));

  two = "region";
  out.println(two.compareTo(one));
 }
}