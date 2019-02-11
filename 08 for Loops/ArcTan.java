//the Taylor series of arctan(1) = pi/4

import java.math.BigDecimal;
import java.math.MathContext;


public class ArcTan{
     int decimals = 200;
     MathContext numDigits = new MathContext(decimals);
     BigDecimal negOne = new BigDecimal(-1, numDigits);
     BigDecimal answer = new BigDecimal(0, numDigits);
     
     public BigDecimal calculate(int numTerms){
          
          for(int i = 0; i<= numTerms; i++){
               answer = answer.add( negOne.pow(i).multiply(BigDecimal.ONE.pow(2*i+1).divide(BigDecimal.valueOf((double)2*i+1), numDigits),numDigits),numDigits);
               //System.out.println(answer);
          }
          
          return answer.multiply(BigDecimal.valueOf((double)4),numDigits);
     }
     
     
}