import java.math.MathContext;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
public class RamSatoRunner{
     
     public static void main(String[] args){
        long startTime = System.nanoTime();
        MathContext mc = new MathContext(10000000);
        BigRamSato obj1 = new BigRamSato();
        
        //System.out.println(obj1.calculate(5000, mc));
        System.out.println(obj1.factorial(BigDecimal.valueOf(100000), mc));
        long endTime = System.nanoTime();
        System.out.println("Run time = "+ (endTime - startTime)/1E9 + " seconds");
        //System.out.println(obj1.factorial(BigDecimal.valueOf(9999999), mc));
          
     }
     
     
}