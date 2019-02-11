//break example

public class Break
{
   public static void main(String args[])
   {
  int run=0;
  for(int i = 0; i <= 10; i++){
  for(run=1; run<=20; run++)
  {
   if(run%3==0)
    break;
  }
  System.out.println(run);
  
  System.out.println("APPLES");
  break;
  }
 }
}
