import java.math.BigInteger;

public class FactorialBigInteger {
    public static void main(String[] args) {
        BigInteger result=BigInteger.ONE;
        for(int i=2;i<=24;i++)
        {
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
