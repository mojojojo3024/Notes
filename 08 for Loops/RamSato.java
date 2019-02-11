import java.math.BigDecimal;
import java.math.MathContext;

public class RamSato
{
     int decimals = 1000;
     MathContext numDigits = new MathContext(decimals);
     public BigDecimal factorial(int in){
          BigDecimal answer = new BigDecimal(in, numDigits);
          if(in == 0)
               return BigDecimal.ONE;
          for (int i = in-1; i>= 1; i--){
               answer = answer.multiply(BigDecimal.valueOf(i),numDigits); 
          }
          return answer;
          
     }
    
     public BigDecimal calculate( int k ){
          BigDecimal coeff = new BigDecimal(2*Math.sqrt(2)/(99*99), numDigits);
          BigDecimal sum = new BigDecimal(0, numDigits);
               for (int i = 0; i <= k; i++){
                    sum = sum.add(factorial(4*i).multiply(BigDecimal.valueOf((double)1103).add(BigDecimal.valueOf((double)26390).multiply(BigDecimal.valueOf((double)i),numDigits)),numDigits).divide(factorial(i).pow(4).multiply(BigDecimal.valueOf((double)396).pow(4*i),numDigits),numDigits), numDigits);
     
          }
          return BigDecimal.ONE.divide(coeff.multiply(sum,numDigits),numDigits);
          
     }
     
     
     
}