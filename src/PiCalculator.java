import java.math.*;

public class PiCalculator
{
    public static void main(String[] args)
    {
       double pi = 0.0;
       for (int k = 0; k < 100; k++)
       {
        System.out.println((1.0/Math.pow(16.0,k)*((4.0/(8.0*k+1) - 2.0/(8.0*k+4) - 1.0/(8.0*k+5) - 1.0/(8.0*k+6)))));
        System.out.print(k+": ");
        System.out.println(pi);
       }

    }
}