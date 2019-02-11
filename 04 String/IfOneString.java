//if statement example using strings

public class IfOneString
{
 public static void main(String args[])
 {
  String stringOne = "big";

  if(stringOne.equals("it"))
  {
     System.out.println("== it");
  }

  if(stringOne.equals("big"))
  {
     System.out.println("== big");
  }
  
  String stringTwo = new String("big") ;
  
  if(stringOne == stringTwo )    // using == to compare objects can result in surprises
  {
       System.out.println(" ahhhhhhhhhhhhhhhhhhhh ") ;
 }
 
}
 
}
