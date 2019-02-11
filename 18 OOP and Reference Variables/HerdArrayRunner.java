
//array of references herd runner

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class HerdArrayRunner
{
 public static void main ( String[] args )
 {
  HerdArray bunch = new HerdArray(5);
  bunch.set(0,3);
  bunch.set(1,5);
  bunch.set(2,6);
  System.out.println(bunch);  
  }
}