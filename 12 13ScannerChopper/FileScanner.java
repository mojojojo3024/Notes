import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.Double;

public class FileScanner{
     
     public static void main(String[] args) throws IOException
     {
          
          Scanner fileIn = new Scanner(new File("elevator.csv"));
          fileIn.useDelimiter(",|\\r\\n");
         
          System.out.println(fileIn.nextLine());
          
          int i = 1;
          double num =0;
          double temp = 0;
          while(fileIn.hasNext()){
               if( i % 2 != 0)
                    fileIn.next();
               if(i % 2 == 0)
                    temp = Double.parseDouble(fileIn.next());
                    if(num < temp)
                         num = temp;
               i++;
          }
          
         fileIn.close();
         System.out.println(num);
     }
     
}