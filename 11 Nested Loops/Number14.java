public class Number13{
     
     public static void main(String[] args){    
          
          String s = "";
          int n = 0;
          for(int i = 0; i<2; i++){
               
               while(n<3){
                    s = "*" + s;
                    n++;
               }
               while(n>0){
                    s+= "-";
                    n--;
               }
               s+="\n";
          }
          System.out.print(s);
     }
     
}