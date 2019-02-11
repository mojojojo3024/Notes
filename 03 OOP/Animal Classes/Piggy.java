public class Piggy{
  
  private int legs = 0;
  private int eyes = 0;
  private String name;
  private double weight = 0;
  private boolean isAlive = true;
  
  
  
  public Piggy(){
    //my piggy
    legs = 4;
    eyes = 2;
    name = "Jeffery";
    weight = 250;
    isAlive = true;
  }
  
  public Piggy(String newName, int newLegs, int newEyes, double newWeight){
    //new piggy
    legs = newLegs;
    eyes = newEyes;
    name = newName;
    weight = newWeight;
    isAlive = true;
  }
  
  public void setName(String newName){
    name = newName;
  }
  
  public void setEyes(int newEyes){
    eyes = newEyes;
    if(newEyes > 2){
      System.out.println("It's a mutant!!");
    }
    if(newEyes == 2){
      System.out.println("you have made something normal, congratulations");
    }
    if(newEyes == 1){
      System.out.println("now he cant tell depth and will eventually walk off a cliff to his ultimate demise, he will not die thoug because pigs are invincible");
    }
    if(newEyes == 0){
      System.out.println("you're pig is now blind, he will never see the beauty of life you horrible person");
    }
  }
  
  public void setLegs(int newLegs){
    legs = newLegs;
    if(newLegs > 4){
      System.out.println("This pig is impossible! How can this be?!");
    }
    if(newLegs == 4){
      System.out.println("well balanced pig");
    }
    if(newLegs < 4){
      System.out.println("your pig is now crippled, well done");
    }
  }
  
  public void setWeight(double newWeight){
    weight = newWeight;
    if(newWeight > 350){
      System.out.println("what a fatty");
    }
    if(newWeight < 200){
      System.out.println("You have made yourself a twig good sir");
    }
  }
  
  public void setIsAlive(boolean alive){
    isAlive = alive;
    if(alive == false){
      System.out.println("FALSE!!! Pigs are immortal and will never die! They will take over this planet with me as their leader!! MWAHAHAHAHA!!");
    }else{
      System.out.println("They will never die hehehehe");
    }  
  }
  
  public void print(){
    System.out.println( " Name: " + name + " Legs: " + legs + " Eyes: " + eyes + " Weight: " + weight + " Alive: " + isAlive);
  }
  public String toString(){
    return " Name: " + name + " Legs: " + legs + " Eyes: " + eyes + " Weight: " + weight + " Alive: " + isAlive;
  }
}
