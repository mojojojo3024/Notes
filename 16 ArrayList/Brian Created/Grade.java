import java.util.ArrayList;
import java.util.Scanner;

public class Grade{
     
     private double myGrade;
     private String myLetterGrade;
     
     ArrayList<Integer> hwk;      //the class in angle brackets tells the compiler what kind of objects will be stored in the ArrayList
     ArrayList<Double> tests;
     ArrayList<Boolean> attendance;  //if present, true.... if absent, false.
     
     public Grade(){
          myGrade = 100.0;
          myLetterGrade = "A";
          hwk = new ArrayList<Integer>();
          tests = new ArrayList<Double>();
          attendance = new ArrayList<Boolean>();
     }
     
     //homework is 10% of total grade (each homework grade is 0-100)
     //tests are 80% of total grade  (each test grade is 0-100)
     //attendance is the remaining 10%
     //calculate the attendance grade by finding the percent of classes in which the student was present, then translate that into a number between 0-10 
     public void homework(){
          ArrayList<Integer> hwkIn = new ArrayList<Integer>();
          
          Scanner kb = new Scanner(System.in);
          int temp = kb.nextInt();
          //store the homework grades by using kb.nextInt() and a method of the ArrayList class
          //think of some way for the user to tell this method that they are finished entering homework grades (hint: if() )
          while(temp != -1){
               hwkIn.add(temp);
               temp = kb.nextInt();
               }
          
          hwk = hwkIn;
          }
     
     public void tests(ArrayList<Double> testsIn ){
          
     }
     
     //write your own method for calculating 
     
     public void calculate(){
          homework();
          //tests();
          //attendance();
          int sum = 0;
          for(int i = 0; i<hwk.size(); i++){
               sum += hwk.get(i);
          }
          myGrade = (double)sum/hwk.size();
     }
     
     public String toString(){
          
          return " " + myGrade + " " + myLetterGrade;
     }
     }