import java.math.BigInteger;

public class mainTestC2 {
    public static void main(String[] args) {
        Euklides_Algorithm euA = new Euklides_Algorithm();

        long integerE = (long) Math.pow(2, 16) + 1;

        BigInteger e = BigInteger.valueOf(integerE);
        BigInteger p = new BigInteger("1844894747213077664125127546568330186824660313880158840836603750876138141394645796190870390267146604217954718945701220920957283154524203090507310546402009");
        BigInteger q = new BigInteger("8911042822575281754351259360469431162438549749954983001230866538190015228433988510560602922206729672700437787248254257478819576492210753371685859625228919");
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        try {
            BigInteger d = euA.inverseMod(e, phi);
            System.out.println("d = " + d);
            System.out.println("Check: e * d mod phi = " + e.multiply(d).mod(phi));

        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());

        }
    }
}
