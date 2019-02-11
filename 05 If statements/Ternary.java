//ternary example
//NOTE:  AP Computer Science A does not include the ternary operator as part of the official subset
//        The ternary operator will not show up on the AP exam.

import java.util.Scanner;

public class Ternary {

 public static void main(String args[])
 {
  Scanner keyboard = new Scanner(System.in);
  int num;

  System.out.print("Enter an integer :: ");
  num = keyboard.nextInt();

                   //if      true    false
  String output =(num>100)? ">100" : "<=100" ;

  System.out.println("num is " + output );
 }
}

  //the idea is to save time/space if you're just checking a rather simple condition
  // The basic structure is:    ( boolean expression ) ? (return this if true) : (return this if false)