public class StringMethods {
 
     public static void main(String[] args){
          String apples = "delicious";
          String oranges = "deliciousness";
          String foxes = "alabama";
          
          // compareTo()
          System.out.println( apples.compareTo(oranges));  // if the characters are all common to both Strings, then it returns apples.length() minus oranges.length()
          System.out.println( foxes.compareTo(apples));    // if there is a difference between a character (starting from the left), it returns the first Unicode minus second Unicode
          System.out.println( oranges.compareTo(foxes));   // d is 100 in ASCII, a is 97... 100-97 = 3
          
          System.out.println("-------------------------------------------------");
          // .length() and .charAt()
          
          for(int i = 0;  ; i++){  //fill in the necessary condition
               //Write code to print out each character using the charAt() method
          }
          
          
          System.out.println("-------------------------------------------------");
          
          // == versus .equals()
          String apples2 = new String("delicious");
          System.out.println(apples2 == apples);  //because the new keyword was used to create apples2, it set aside a new chunk of memory
          System.out.println( apples2.equals(apples));  //the .equals() method is defined to compare the actual contents of the String objects
          
          System.out.println("-------------------------------------------------");
          
          // .indexOf() and .lastIndexOf()
          System.out.println(apples.indexOf('i'));  //you can input a char
          System.out.println(apples.indexOf("i"));  //you can input a String
          System.out.println(apples.indexOf('i', 4));  //you can input a second argument telling the method which index to start searching from
          
          System.out.println(apples.lastIndexOf('i'));  //lastIndexOf() begins searching from the end of the string and goes toward the beginning  
          System.out.println(foxes.indexOf("bama"));  //the index of the beginning of the string is returned
          
          System.out.println("-------------------------------------------------");
          
          //substring()
          int begin = apples.indexOf("cious");
          int begin2 = oranges.indexOf("cious");
          System.out.println( apples.substring(begin) );
          System.out.println( oranges.substring(begin2) );
          System.out.println( oranges.substring(begin2, begin2 + 5));  //when you pass two integers as the arguments of substring(), the second one tells it where to stop (not including that index)
          
          
     }
}