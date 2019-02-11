import java.util.ArrayList;

public class Tree implements Comparable<Tree>{
     private int age;
     private boolean hasLeaves;
     private String species;
     private double height;
     private ArrayList<String> inhabitants;
     private Branch branch1;
     private ArrayList<Branch> branchArray;
     
     public Tree(){
      age = 0;
      hasLeaves = true;
      species = "aspen";
      height = 0;
      inhabitants = new ArrayList<String>();
      //branch1 = new Branch();
      branchArray = new ArrayList<Branch>();
      
     }
     
     public Tree(int ageIn, boolean hasLeavesIn, String speciesIn, double heightIn, ArrayList<String> inhabitantsIn, ArrayList<Branch> branch1In ){
      age = ageIn;
      hasLeaves = hasLeavesIn;
      species = speciesIn;
      height = heightIn;
      inhabitants = new ArrayList<String>(inhabitantsIn);
      branchArray = new ArrayList<Branch>(branch1In);
     }
     
     public Tree(Tree in){
          age = in.getAge();
          hasLeaves = in.getHasLeaves();
          species = in.getSpecies();
          height = in.getHeight();
          inhabitants = in.getInhabitants();
          //branch1 = in.getBranchArray();
          //branchArray;
          
          
     }
     
     public void setAge(int in){
          age = in;
     }
     public int getAge(){
          return age;
     }
     public void setHasLeaves(boolean in){
          hasLeaves = in;
     }
     public boolean getHasLeaves(){
          return hasLeaves;
     }
     public void setSpecies(String in){
          species = in;
     }
     public String getSpecies(){
          return species;
     }
     
     public double getHeight(){
          return height;
     }
     
     public void setHeight(double in){
          height = in;
     }
     
     public void setBranchArray(ArrayList<Branch> branchIn){
          branchArray = new ArrayList<Branch>(branchIn);
     }
     public ArrayList<Branch> getBranchArray(){
          return branchArray;
     }
     
     public ArrayList<String> getInhabitants (){
          return inhabitants;
     }
     public void setInhabitants(ArrayList<String> in){
          inhabitants = new ArrayList<String>(in);
     }
     
     public int compareTo(Tree ob){
          if(height > ob.getHeight())
               return 1;
          else if(height < ob.getHeight())
               return -1;
          else               
               return 0;
     }
     
     public String toString(){
          return " " + age + " " + hasLeaves + " " + species + " " + height + " " + inhabitants + " " + branch1;
     }
     
}