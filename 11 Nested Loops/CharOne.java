//Character class example

public class CharOne
{
   public static void main(String args[])
   {
  char c ='A';
  System.out.println(Character.isUpperCase(c));
  System.out.println(Character.isLowerCase(c));
  System.out.println(Character.isDigit(c));
  System.out.println(Character.toUpperCase(c)); 
  System.out.println(Character.toLowerCase(c));     
 }
}

//Notice that no Character object is being instantiated.  The methods are just being called without creating an object
//first.  This is a benefit of static methods.  Most of the methods in the Character class are static... meaning they
//can be used without first creating an object.
