public class Unit89Test{
     
     public static void main(String[] args){
          
          String s = "";
          int n = 0;
          for(int i =0;i<2;i++){
               while(n<3)
               {
                    
                    s="*"+s;
                    System.out.println(s);
                    n++;
                    
               }
               
               while(n>0){
                    
                    s+="-";
                    System.out.println("B"+s);
                    n--;
               }
               s+="\n";
               System.out.println("newline"+s);
          }
          System.out.print(s);
          
          
     }
}