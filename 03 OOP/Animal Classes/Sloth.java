

public class Sloth    
{
  private boolean isSlow;
  private String type;
  private double mass;
  private int age;
  private int numberOfToes;
  
  public Sloth()
  {
    isSlow= true;
    type= "giant ground sloth";
    mass= 50.5;
    age= 10;
    numberOfToes= 8;
  }
  public Sloth(int years, int toes, double kilograms, String slothType, boolean slow)
  {
    isSlow= slow;
    type= slothType;
    mass= kilograms;
    age= years;
    numberOfToes= toes;
  }
  public void setAge(int years)
   {
    age=years;
   }
   public void setMass(int kilograms)
   {
    mass=kilograms;
   }
   public void print()
   {
      System.out.println( " Sloth is slow:" + isSlow + "\n type of sloth:" + type + "\n mass:" + mass+ "\n age:" +age+ "\n number of toes:" +numberOfToes );
   }
    public String toString()
   {
     return " \n Sloth is slow:" + isSlow + "\n type of sloth:" + type + "\n mass:" + mass+ "\n age:" +age+ "\n number of toes:" +numberOfToes;
   }

}