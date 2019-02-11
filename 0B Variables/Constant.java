

//constant/final example

public class Constant
{
 public static void main(String args[])
 {
      final int MAX = 90877;
  int numOne;
  numOne = MAX;  //legal

  //MAX = 92087;  //illegal  (try uncommenting the beginning of this line and compiling)

  System.out.println(MAX);
  System.out.println( numOne + "\n\n" );

  numOne = Integer.MAX_VALUE;  //built in constant
  System.out.println(numOne + "\n\n");

  numOne = Integer.MIN_VALUE;  //built in constant
  System.out.println(numOne + "\n\n");
 }
}
