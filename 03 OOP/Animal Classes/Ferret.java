  public class Ferret{
  private String name;
  private String color;
  private boolean isCute;
  private int level;
  private double stealRating;
  private String tagline;
  
  public Ferret(){
    //default ferret
    name = "Link";
    isCute = true;
    level = 100;
    stealRating = 100.0;
    color = "brown";
    tagline = "DEAHHHHHH!";
    
  }
  
  public Ferret(String newName, String newColor, int newLevel, double newRating, String newTagline){
    //user-created ferret
    name = newName;
    isCute = true;
    level = newLevel;
    stealRating = newRating;
    color = newColor;
    tagline = newTagline;
  }
  
  public void setName(String newName){
    name = newName;
  }
  
  public void setLevel(int newLvl){
    level = newLvl;
    if(level > 9000){
      System.out.println("That's a strong ferret, Bob.");
      System.out.println("");
    }
  }
  
  public void setStealRating(double newRating){
    stealRating = newRating;
  }
  
  public void setCuteness(boolean cuteness){
    isCute = cuteness;
    if(cuteness == false){
       System.out.println("Every ferret is cute, and you are a liar.");
       System.out.println("");
       isCute = true;
    } else {
       System.out.println("Darn right.");
       System.out.println("");
    }
  }
  
  public void setColor(String newColor){
    color = newColor;
  }
  
  public void setTagline(String newTagline){
    tagline = newTagline;
  }
  
  public String getName(){
    return name;
  }
  
  public String getColor(){
    return color;
  }
  
  public double getRating(){
    return stealRating;
  }
  
  public boolean getCuteness(){
    return isCute;
  }
  
  public int getLvl(){
    return level;
  }
  
  public String getTagline(){
    return tagline;
  }
  
  public void print(){
    System.out.println("This " + color + " ferret's name is " + name + ", coming in at a level of " + level + ".");
    System.out.println(name + "'s success rate when stealing things is " + stealRating + "%! Wow!");
    System.out.println(name + "'s favorite thing to say is: " + tagline);
    System.out.println("");
  }
}