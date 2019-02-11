//String indexOf() method

import static java.lang.System.*;

public class IndexOf
{
   public static void main( String args[] )
   {
  String s = "catswoo";
  int index = s.indexOf("oo");
  out.println(index);
  index = s.indexOf('w');
  out.println(index);
  index = s.indexOf('x');
  out.println(index);
  
  index = s.indexOf("at");
  out.println(index);
  index = s.lastIndexOf('o');
  out.println(index);
  index = s.lastIndexOf("swoo");
  out.println(index);
  }
}