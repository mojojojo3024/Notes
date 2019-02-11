

//character example

public class Chars
{
 public static void main(String args[])
 {
  char alpha = 'A';
  char ascii = 65;
  char sum = 'B' + 1;

  System.out.println(alpha);
  System.out.println(ascii);
  System.out.println(sum);

  System.out.println('B'+1);   //char is an integer type

  System.out.println('A'+5);
  System.out.println((char)('A'+5));  //what does this use of (char) before the expression ('A'+5) do?
 }
}
