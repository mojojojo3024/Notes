import static java.lang.System.*;

public class Pangolin
{
  private int antsEaten;
  private String catchPhrase;
  private double massOfEatenAnts;
  private boolean hasScales, isADotaHero;
    
  public Pangolin()
  {
    antsEaten = 0;
    catchPhrase = "Yah Yeet";
    massOfEatenAnts = 0;
    hasScales = true;
    isADotaHero = true;      
  }
  
  public Pangolin(int hungry)
  {
    antsEaten = hungry;
    catchPhrase = "Yah Yeet";
    massOfEatenAnts = hungry * .05;
    hasScales = true;
    isADotaHero = true;
  }
  
  public void eatMore(int hungry)
  {
    antsEaten = hungry;
    catchPhrase = "Yah Yeet";
    massOfEatenAnts = hungry * .05;
    hasScales = true;
    isADotaHero = true;
  }
  
  public void showEaten()
  {
    out.println(antsEaten);
  }
  
  public void showEatenMass()
  {
    out.println(massOfEatenAnts);
  }
  
  public void catchPhrase()
  {
    out.println(catchPhrase);
  }
  
  public boolean scales()
  {
    return hasScales;
  }
  
  public boolean dota()
  {
    return isADotaHero;
  }
}

  