import java.math.*;

public class PiCalculator
{
    public static void main(String[] args)
    {
       MathContext mc = new MathContext(20,RoundingMode.HALF_UP);
       BigDecimal pi = new BigDecimal(0.0);
       BigDecimal one = new BigDecimal(1.0);
       BigDecimal sixteen = new BigDecimal(16.0);
       BigDecimal eight = new BigDecimal(8.0);
       BigDecimal four = new BigDecimal(4.0);
       BigDecimal two = new BigDecimal(2.0);
       
       //BigDecimal twoThirds = new BigDecimal(1.0);
       //a = 4/(8*(k+1)) 
       //int k = 1;
       for (int k = 0; k < 10; k++)
       {
        BigDecimal a = four.divide(eight.multiply(new BigDecimal(k + 1),mc),mc);
        //b = 2.0/(8.0*k+4)
        BigDecimal b = two.divide(eight.multiply(new BigDecimal(k+4),mc),mc);
        //c = 1.0(8.0*(k+5));
        BigDecimal c = one.divide(eight.multiply(new BigDecimal(k + 5, mc),mc),mc);
        //d 1.0/(8.0*(k+6))
        BigDecimal d = one.divide(eight.multiply(new BigDecimal(k+6,mc),mc),mc);

        pi = pi.add((one.divide(sixteen,mc)).multiply(a.subtract(b,mc).subtract(c,mc).subtract(d,mc),mc),mc);
        System.out.println(pi);
       }
       
       //for (int k = 0; k < 100; k++)
       //{
        //System.out.print(k+": ");
        //System.out.println((1.0/Math.pow(16.0,k)*((4.0/(8.0*k+1) - 2.0/(8.0*k+4) - 1.0/(8.0*k+5) - 1.0/(8.0*k+6)))));
        //System.out.print(k+": ");
       // System.out.println(pi);
       //}

    }
}