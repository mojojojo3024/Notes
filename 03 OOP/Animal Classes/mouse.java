public class mouse{ 
private String name;
 private boolean small;
 private double powerlvl;
 private int krillin;
  private String life;
  
 public mouse(){
    //Goku
  name = "Kakarot";
    small = true; 
    life = "short";
    powerlvl = 9001;
    krillin = 1200;
 }
 public mouse (String newName , int newPowerlvl , String newLife){
   //new mouse
   name = newName;
     small = true;
     life = newLife;
     powerlvl = newPowerlvl;
     krillin = 1200;
 }  
 
 public void setName(String newName){
   name = newName;
 }
 public void setSmall(boolean newSmall){
   small = true;
 }
 public void setPowerlvl(int newPowerlvl){
   powerlvl = newPowerlvl;
 }
 public void setLife(String newLife){
   life = newLife;
 }
 
 public void setKrillin(int newKrillin){
   krillin = newKrillin;
 }
 public void print(){
   System.out.println("this"+ small +"mouse named" + name +" has a power level of" + powerlvl + " and a friend named Krillin with a power level of" + krillin + "but there life is" + life);
 }
 public boolean getSmall(){
   return small;
 }
}
  