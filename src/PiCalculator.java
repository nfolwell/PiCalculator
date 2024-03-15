import java.math.*;

public class PiCalculator
{
    public static void main(String[] args)
    {
       int digits = 10003;
       MathContext mc = new MathContext(digits,RoundingMode.HALF_UP);
       BigDecimal pi = new BigDecimal(0.0);
       BigDecimal one = new BigDecimal(1.0,mc);
       BigDecimal two = new BigDecimal(2.0,mc);
       BigDecimal four = new BigDecimal(4.0,mc);
       BigDecimal five = new BigDecimal(5.0,mc);
       BigDecimal six = new BigDecimal(6.0,mc);
       BigDecimal eight = new BigDecimal(8.0,mc);
       BigDecimal sixteen = new BigDecimal(16.0,mc);

       for (int k = 0; k < digits; k++)
       {
        //a = 4/(8*(k+1)) 
        BigDecimal a = four.divide(eight.multiply(new BigDecimal(k,mc)).add(one,mc),mc);
        //b = 2.0/(8.0*k+4)
        BigDecimal b = two.divide(eight.multiply(new BigDecimal(k,mc)).add(four,mc),mc);
        //c = 1.0(8.0*(k+5));
        BigDecimal c = one.divide(eight.multiply(new BigDecimal(k,mc)).add(five,mc),mc);
        //d 1.0/(8.0*(k+6))
        BigDecimal d = one.divide(eight.multiply(new BigDecimal(k,mc)).add(six,mc),mc);

        pi = pi.add((one.divide(sixteen,mc).pow(k,mc)).multiply((a.subtract(b,mc)).subtract(c,mc).subtract(d,mc),mc),mc);
       
       }
       System.out.println(pi);
     /*  double dPi = 0.0;
       for (int k = 0; k < 10; k++)
       {
        System.out.print(k+": ");
        dPi += (1.0/Math.pow(16.0,k)*((4.0/(8.0*k+1) - 2.0/(8.0*k+4) - 1.0/(8.0*k+5) - 1.0/(8.0*k+6))));
        //System.out.print(k+": ");
        System.out.println(dPi);
       }*/

    }
}