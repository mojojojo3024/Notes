public class Seventeen{
     
     public static void main(String[] args){
          int i = 97;
          int j = 0;
          while(i!=1){
               if(i%2==0)
                    i/=2;
               else
                    i=i*3+1;
               j++;
          }
          System.out.print(j);
     }
}