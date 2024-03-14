import java.math.*;

public class PiCalculator
{
    public static void main(String[] args)
    {
       BigDecimal pi = new BigDecimal(0.0);
       BigDecimal one = new BigDecimal(1.0);
       BigDecimal sixteen = new BigDecimal(16.0);
       BigDecimal four = new BigDecimal(4.0);
       BigDecimal two = new BigDecimal(2.0);
       two.setScale(100);
       BigDecimal three = new BigDecimal(3.0);
       three.setScale(100);
       BigDecimal twoThirds = new BigDecimal(1.0);
       twoThirds = two.divide(three);
       System.out.println(twoThirds);
       

       //for (int k = 0; k < 100; k++)
       //{
        //System.out.print(k+": ");
        //System.out.println((1.0/Math.pow(16.0,k)*((4.0/(8.0*k+1) - 2.0/(8.0*k+4) - 1.0/(8.0*k+5) - 1.0/(8.0*k+6)))));
        //System.out.print(k+": ");
       // System.out.println(pi);
       //}

    }
}