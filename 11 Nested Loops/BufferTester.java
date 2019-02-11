public class BufferTester{
     
     public static void main(String[] args){
     
          StringBuffer one = new StringBuffer("word");
          StringBuffer two = new StringBuffer(one);
          
          //System.out.println(one + two);    //uncomment this line and give it ago
          System.out.println(one.append(two));  
          
          String string1 = "apples";
          System.out.println(one + string1);
          System.out.println(string1 + one);  //why does it print what it prints?
          
          System.out.println( "abc" + two );
          
          System.out.println( one.length() );
          System.out.println( one.indexOf("w"));    //when using indexOf() and lastIndexOf() wuth StringBuffers, the arguments must be Strings
          System.out.println( one.lastIndexOf("w"));  //you cannot use indexOf('w') because each spot in a StringBuffer is a String itself.
          
          //so why use StringBuffers other than the append() and insert() methods?
          
          double startTime = System.nanoTime();  
          for(int i = 1; i <= 100; i++)
               two.append("!");                //let's see you do this with a String!
          System.out.println(two); 
          // StringBuffers grow dynamically to fit whatever you're putting in them. 
          double endTime = System.nanoTime();
          System.out.println((endTime-startTime)/1E9 + " seconds");  //This just prints out the time elapsed between startTime and endTime in nanoseconds.
                                                                     // Dividing by 1E9 converts it to seconds.
          
          
          startTime = System.nanoTime();
          for(int i = 1; i<=100; i++)
               string1 += "!";                  //okay... so it wasn't so hard to do with a String.  What's the difference?  Try increasing the loops A LOT
          System.out.println(string1);
          endTime = System.nanoTime();
          System.out.println((endTime-startTime)/1E9 + " seconds");
          
     }
     
     
     
}