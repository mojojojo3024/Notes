public class Distributive{
     public static void main(String[] args){
          boolean C = false;
          boolean S = false;
          boolean I = true;
          
          boolean left = C && (S || I);
          boolean right = (C && S) || (C && I);
          
          System.out.println(left);
          System.out.println(right);
     }
}