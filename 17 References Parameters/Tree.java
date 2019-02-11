public class Tree{
     private int age;
     private boolean hasLeaves;
     private String species;
     private double height;
     private ArrayList<String> inhabitants;
     private Branch branch1;
     
     public Tree(){
      age = 0;
      hasLeaves = true;
      species = null;
      height = 0;
      inhabitants = new ArrayList<String>();
      branch1 = new Branch();
     }
     
     public Tree(int ageIn, boolean hasLeavesIn, String speciesIn, double heightIn, ArrayList<String> inhabitantsIn, Branch branch1In ){
      age = ageIn;
      hasLeaves = hasLeavesIn;
      species = speciesIn;
      height = heightIn;
      inhabitants = new ArrayList<String>(inhabitantsIn);
      branch1 = new Branch(branch1In);
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
     
}