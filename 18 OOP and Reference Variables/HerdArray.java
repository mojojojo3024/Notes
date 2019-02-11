

//array of references as instance variable example

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections;

public class HerdArray
{
 private Creature[] things;

 public HerdArray()
 {
    things = new Creature[10];

 }  
 
 public HerdArray(int size)
 {
     things = new Creature[size];

 } 
 
 public void set(int spot, int creatureSize )
 {
     things[spot] = new Creature(creatureSize); 
 }
 
 public String toString()
 {
  return "" + Arrays.toString( things );
 }
}