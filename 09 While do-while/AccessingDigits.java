//this example demonstrates how to to use a
//while loop to access all of the digits of a number

public class AccessingDigits
{
   public static void main(String args[])
   {
  int number = 8123456;
  int temp = number;
  int powTen = -1;
  while( temp > 0){
      powTen++;
      temp /= 10  ;
  }
  
  for( int i = powTen; i >= 0; i--){
       System.out.println( (int)number/(int)Math.pow(10,powTen));
       number%=Math.pow(10,powTen); 
       powTen--;
  }
  
 }
}
