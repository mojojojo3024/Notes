public class Giraffe{
  
  private int neckLength = 0;
  private String name;
  private int size = 0;
  private boolean alive = true;
  private double legLength = 0;

  
  public Giraffe(){
   
  neckLength = 7;
  name = "George";
  size = 5;
  alive = true;
  legLength = 6;
    
  }
  
  public Giraffe(String gName, int gNeck, int gSize, double gLength, boolean gkill){
   
    neckLength = gNeck;
    name= gName;
    size = gSize;
    legLength = gLength;
    alive = gkill;
    
    
  }
  
  public void setGiraffe(String gName, int gNeck, int gSize, double gLength, boolean gkill){
   
    neckLength = gNeck;
    name = gName;
    size = gSize;
    legLength = gLength;
    alive = gkill;
    
    if(gName == null){ //|| gNeck == null || gSize == null || gLength == null || gkill == null){
     name = "George"; 
    }
    
    if(gNeck == 0){ //|| gNeck == null || gSize == null || gLength == null || gkill == null){
     neckLength = 7; 
    }
    
    if(gSize == 0){ //|| gNeck == null || gSize == null || gLength == null || gkill == null){
     size = 5; 
    }
    
    if(gLength == 0){ //|| gNeck == null || gSize == null || gLength == null || gkill == null){
     legLength = 6; 
    }
    
    if(gkill == false){ //|| gNeck == null || gSize == null || gLength == null || gkill == null){
     alive = false; 
    }
  }


  public void drawGiraffe(){
    
    if (alive == false){
      
      System.out.println("You just killed "+name+" the Giraffe");
      
    } else {
      System.out.println("---------------------------------");
      System.out.println(name+" the Giraffe:\n");
      System.out.println("<8|>");
    
      for(int x = 0; x <= neckLength; x++){
        System.out.println(" U ");
      }
     
      System.out.print(" ");
    
      for(int x = 0; x <= size; x++){
        System.out.print("-");
      }
     
      System.out.println(" ");
                    
      for(int x = 0; x <= 2; x++){
        System.out.print("|");
        
        for(int y = 0; y <= size; y++){
          System.out.print(" ");
          
        }
      
        System.out.println(" | ");
      
      }

      System.out.print(" ");
         
      for(int x = 0; x <= size; x++){
        System.out.print("-");
      }
      
      System.out.println(" ");
      
      
      for(int x = 0; x <= legLength; x++){
      System.out.println(" | | | |");
    }
      
    }
      
     System.out.println("---------------------------------");
  }
  
  public void killGiraffe(){
    
   alive = false; 
   drawGiraffe();
 
  }
  
  public void makeNoise(){
    
    System.out.println("\nWoof Woof! [Giraffe Noises]");
    
  }
  
  public int getRaffage(){
    
    return size;
    
  }
  
  public void whatIsGiraffe(){
    
    System.out.println(name +" is a genus of African even-toed ungulate mammals, the tallest living terrestrial animals and the largest ruminants. The genus currently consists of one species, Giraffa camelopardalis, the type species. Seven other species are extinct, prehistoric species known from fossils.");
    
  }  
}