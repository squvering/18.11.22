import java.math.BigInteger;
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger f1 = BigInteger.ONE, f2 = BigInteger.ONE, count = BigInteger.ZERO, sum = BigInteger.ZERO, temp;
        n = n.add(BigInteger.ONE);

        while(count.compareTo(n) == -1) {
            sum = sum.add(f1);
            temp = f1;
            f1 = f2;
            f2 = f2.add(temp);
            count = count.add(BigInteger.ONE);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}

