
//overloading example

import static java.lang.System.*;

public class Overload
{
  public static void main ( String[] args )
  {
    Monster one = new Monster();
    System.out.println(one);

    Monster two = new Monster(45); //How does Java know which constructor to call?
    System.out.println(two);

    Monster three = new Monster(66.98);
    System.out.println(three);

    Monster four = new Monster(45,98.9);
    System.out.println(four);
  }

class Monster
{
 private int height;    //default assinged to 0
 private double weight;   //default assinged to 0
 private String name; 
 //add in name and modify each constructor for name

 public Monster()
 {
  height=0;
  weight=0.0;
  name = "";
 }

 public Monster(int ht)
 {
  height=ht;
  weight=0.0;
  name = "";
 }

 public Monster(double wt)
 {
  height=0;
  weight=wt;
  name = "";
 }

 public Monster(int ht, double wt)
 {
  height=ht;
  weight=wt;
  name = "";
 }

public Monster(int ht, double wt, String nameIn)
 {
  height=ht;
  weight=wt;
  name = nameIn;
 }
 //add in one more constructor to account for the name



   public String toString()
   {
       return height + "\t" + weight;
   }
}


}