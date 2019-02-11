import java.util.ArrayList;

public class Branch{
     
     private String color;
     private int numLeaves;
     private ArrayList<Leaf> leafArray;
     
     public Branch(){
          color = "brown";
          numLeaves = 0;
          leafArray = new ArrayList<Leaf>();
     }
     
     public Branch(String colorIn, int numLeavesIn, ArrayList<Leaf> leafArrayIn){
          color = colorIn;
          numLeaves = numLeavesIn;
          leafArray = new ArrayList<Leaf>(leafArrayIn);
     }
     
     //contstructor which takes a Branch object as a parameter, and creates a new Branch which has all the same instance variables
     public Branch(Branch branchIn){
          color = branchIn.getColor();
          numLeaves = branchIn.getNumLeaves();
          leafArray = new ArrayList<Leaf>( branchIn.getLeafArray() );
     }
     
     public void setColor(String colorIn){
          color = colorIn;
     }
     public String getColor(){
          return color;
     }
     public void setNumLeaves(int numLeavesIn){
          numLeaves = numLeavesIn;
     }
     public int getNumLeaves(){
          return numLeaves;
     }
     public void setLeafArray(ArrayList<Leaf> leafArrayIn){
          leafArray = new ArrayList<Leaf>(leafArrayIn);
     }
     public ArrayList<Leaf> getLeafArray(){
          return leafArray;
     }
     
     public boolean equals(Branch in){
          if(color.equals(in.getColor()))
               if(numLeaves == in.getNumLeaves())
                    if(leafArray.equals(in.getLeafArray()))
                         return true;
          return false;
     }
     
     public String toString(){
          return " " + color + " "+numLeaves + " " + leafArray;
     }
     
}