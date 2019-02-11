import java.math.BigDecimal;
import java.math.MathContext;
import java.lang.Integer.*;
public class BigTester{
     public static void main(String[] args){
          MathContext mc = new MathContext(1000000);
          
          BigDecimal number = new BigDecimal(1000, mc); 
          
          System.out.print(factorial(number, mc));
     }
     
     public static BigDecimal factorial(BigDecimal input, MathContext mc){
          
          BigDecimal i = input;
          
          
          BigDecimal answer = input;
          
          if(input.equals(BigDecimal.ZERO)){
               return BigDecimal.ONE;
          } 
          for ( i = i.subtract(BigDecimal.ONE) ; !i.equals(BigDecimal.ONE); i = i.subtract(BigDecimal.ONE)){
               answer = answer.multiply(i, mc);
          }
          return answer;
     }
}