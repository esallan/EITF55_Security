import java.math.BigInteger;

public class RSA_Program {

    public RSA_Program() {
    }

    public BigInteger inverseMod(BigInteger a, BigInteger m) {
        BigInteger d1 = m;
        BigInteger d2 = a;
        BigInteger v1 = BigInteger.ZERO;
        BigInteger v2 = BigInteger.ONE;
        BigInteger q;
        BigInteger t1;
        BigInteger t2;

        while (!d2.equals(BigInteger.ZERO)) {
            q = d1.divide(d2);
            t1 = v1.subtract(q.multiply(v2));       //Uppdaterar koeff för a
            t2 = d1.subtract(q.multiply(d2));       //Uppdatarer resten
            v1 = v2;                                //byter koeff
            v2 = t1;                                //byter koeff
            d1 = d2;                                //byter rest
            d2 = t2;                                //byter rest
        }
        if (!d1.equals(BigInteger.ONE)) {
            throw new ArithmeticException("there is no inverse");
        }

        //reducera v1 med modulo m så vi får [-m, m]
        BigInteger k = v1.divide(m);
        BigInteger inverse = v1.subtract(k.multiply(m));

        //om inversen blir negativt lägger vi den i talområdet [0,m]
        if (inverse.compareTo(BigInteger.ZERO) < 0) {
            inverse = inverse.add(m);
        }
        return inverse;
    }
}
