//write a method using indexOf and substring
//you will also use if statements
// do not use any loops

import static java.lang.System.*;

public class Chunk
{
 /*
  *method getFirstChunk() should return
  *all letters up to the first @ sign
  *if there is no @ return "CATSAREAWESOME"
  *if the string starts with an @, return "CATSAREAWESOME"
  */
 public static String getFirstChunk( String line )
 {
  int index = line.indexOf('@');
  String firstChunk;
  
  if ( index == -1 ){
       return "CATSAREAWESOME";
  }
  
  if (index == 0) {
       return "CATSAREAWESOME";
       
  }
     return firstChunk = line.substring(0,index);  
  
 }

   public static void main( String args[] )
   {
  System.out.println( getFirstChunk("elephants@are@big") );    //outs elephants
  System.out.println( getFirstChunk("computer@science") );    //outs computer
  System.out.println( getFirstChunk("dogs@are@smarte@than@cats") );   //outs dogs
  System.out.println( getFirstChunk("chickens@are@kewl") );   //outs chickens
  System.out.println( getFirstChunk("dogscats") );      //outs CATSAREAWESOME
  System.out.println( getFirstChunk("funny@@@") );     //outs funny
  System.out.println( getFirstChunk("@@@@funny@@@") );     //outs CATSAREAWESOME  
   }
}