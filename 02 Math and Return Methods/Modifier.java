

//modifier method example

import static java.lang.System.*;

class Sum
{
   private int one, two;
   private int total;

   public void setNums( int n1, int n2 )
   {
      one=n1;
      two=n2;
   }
   
   //what if another class had a reason to "see" the values stored in one & two?  Can you write a method which would a
   //llow another class to see what they are?

   public void add()
   {
      total = one + two;
   }

   public void print()
   {
      System.out.println(total);
   }
}

public class Modifier
{
   public static void main(String args[])
   {
      Sum test = new Sum();

      //comment this next line and rerun the program
      test.setNums(4,9);

      test.add();
      test.print();

      test.setNums(45,92);

      test.add();
      test.print();
   }
}