//random numbers example

//import java.lang.Math;
import java.util.Random;

public class RandomOne
{
 public static void main ( String[] args )
 {
  double decOne;
  int intOne;
  decOne = Math.random() * 10;
  intOne = (int)Math.random() * 10;  //this line needs help

  System.out.println("Math.random()");
  System.out.println(decOne);
  System.out.println(intOne);   //why does it always output 0?

  System.out.println("\n\nRandom Class");
  Random rand = new Random();
  intOne = rand.nextInt(256);
  System.out.println(intOne);
  intOne = rand.nextInt(256);
  System.out.println(intOne);
  intOne = rand.nextInt(256);
  System.out.println(intOne);
  
  System.out.println("\n\nOther methods of Random class\n");
  System.out.println(rand.nextBoolean());
  System.out.println(rand.nextBoolean());
  
  System.out.println(rand.nextDouble());
  System.out.println(rand.nextDouble());
  
 }
}