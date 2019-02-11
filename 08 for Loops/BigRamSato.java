import java.math.BigDecimal;
import java.math.MathContext;
import java.lang.Integer.*;
public class BigRamSato{
     
     
     public BigDecimal factorial(BigDecimal input, MathContext mc){
          
          BigDecimal i = input;
          
          
          BigDecimal answer = input;
          
          if(input.equals(BigDecimal.ZERO)){
               return BigDecimal.ONE;
          } else if(input.equals(BigDecimal.ONE)){
               return BigDecimal.ONE;
          } else{
          for ( i = i.subtract(BigDecimal.ONE) ; !i.equals(BigDecimal.ONE); i = i.subtract(BigDecimal.ONE)){
               answer = answer.multiply(i, mc);
          }
          }
          return answer;
     }
     
     public BigDecimal calculate( int k, MathContext mc ){
          BigDecimal coeff = new BigDecimal(2*Math.sqrt(2)/(99*99), mc);
          BigDecimal sum = new BigDecimal(0, mc);
          BigDecimal A = new BigDecimal(0, mc);
          BigDecimal B = new BigDecimal(0, mc);
          BigDecimal C = new BigDecimal(0, mc);
          BigDecimal D = new BigDecimal(0, mc);
               for (int i = 0; i <= k; i++){
                    A = factorial(BigDecimal.valueOf(4*i), mc);
                    //System.out.println("A is: "+ A);
                    B = BigDecimal.valueOf(26390*i+1103);
                    //System.out.println("B is: "+ B);
                    C = factorial(BigDecimal.valueOf(i), mc).pow(4);
                    //System.out.println("C is: "+ C);
                    D = BigDecimal.valueOf(396).pow(4*i);
                    //System.out.println("D is: "+ D);
                    //sum = sum.add(factorial(BigDecimal.valueOf((double)4*i), mc).multiply(BigDecimal.valueOf((double)1103).add(BigDecimal.valueOf((double)26390).multiply(BigDecimal.valueOf((double)i),mc)),mc).divide(factorial(BigDecimal.valueOf(i), mc).pow(4).multiply(BigDecimal.valueOf((double)396).pow(4*i),mc),mc), mc);
                    sum = sum.add(A.multiply(B, mc).divide(C, mc).divide(D, mc), mc);
          }
          return BigDecimal.ONE.divide(coeff.multiply(sum,mc),mc);
          
     }
     
     
}