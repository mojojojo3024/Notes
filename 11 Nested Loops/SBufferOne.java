//StringBuffer example

import static java.lang.System.*;

public class SBufferOne
{
   public static void main(String args[])
   {
  StringBuffer s = new StringBuffer("abc");
  out.println(s);
  s.setCharAt(0,'X'); 
  out.println(s);  
  s.setLength(10); 
  s.setCharAt(9,'0');   
  out.println(s);  
  out.print(s.charAt(8));
  out.println(s.charAt(9));
  s.reverse();   
  out.println(s); 
  
 }
}

