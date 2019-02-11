//csv File output using a for loop
//csv files can represent tabular data (like in a table or spreadsheet)... rows/columns
//columns are separated by commas
//rows are separated by newline characters
//try opening the output of this program with Microsoft Excel

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.*;

public class CreateCSV
{
 public static void main(String args[]) throws IOException
 {
  PrintWriter fileOut = new PrintWriter("out.csv");

  for ( int i=0; i<10; i++)
  {
     fileOut.println(i+","+i+2);
     
  }
  fileOut.close();  //have to close the file
 }
}