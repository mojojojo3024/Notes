//String basics - constructors and initialization

import static java.lang.System.*;

public class Basics
{
   public static void main( String args[] )
   {
  String s = "catscatscats123";
  
  String champ = new String("catscatscats456");
  
  out.println(s + " " + champ); 
  
  out.println( s + " " + champ); 
  
  System.out.println( s.indexOf( 'c' ) );  //play with this... change the char in single quotes
 }
}