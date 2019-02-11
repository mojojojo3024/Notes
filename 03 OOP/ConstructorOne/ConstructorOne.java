//constructor example 1

import static java.lang.System.*;  //static import - allows you to type on out
                 //instead of typing System.out



public class ConstructorOne
{
  public static void main ( String[] args )
  {
    Triangle test = new Triangle();
    test.print();
  }
}

class Triangle
{
   private int sideA, sideB, sideC;  //variables defined at the top of a class like this are named Instance Variables
   
   public Triangle()
   {
      sideA=0;
      sideB=0;
      sideC=0;
   }

   public void print()
   {
    out.println(sideA + " " + sideB + " " + sideC);
   }
}