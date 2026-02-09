import java.math.BigInteger;
import java.util.Random;

public class mainTestD {
    public static void main(String[] args) {
        Euklides_Algorithm euA = new Euklides_Algorithm();
        Random rnd = new Random();

        //Setup
        long integerE = (long) Math.pow(2, 16) + 1;
        BigInteger e = BigInteger.valueOf(integerE);
        BigInteger p = new BigInteger("1844894747213077664125127546568330186824660313880158840836603750876138141394645796190870390267146604217954718945701220920957283154524203090507310546402009");
        BigInteger q = new BigInteger("8911042822575281754351259360469431162438549749954983001230866538190015228433988510560602922206729672700437787248254257478819576492210753371685859625228919");
        BigInteger N = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger d = euA.inverseMod(e, phi);

        //Steg 1:
        BigInteger s;
        do {
            s = new BigInteger(N.bitLength(), rnd);
        } while (s.compareTo(BigInteger.ONE) <= 0 || s.compareTo(N) >= 0);

        BigInteger check1 = N.subtract(s); //Ska vara positivt.
        System.out.println("check1 = " + check1);
        System.out.println("s = " + s);

        //Steg 2: Kryptering
        BigInteger c = s.modPow(e, N);
        System.out.println("c = " + c);

        //Steg 3: Dekryptering
        BigInteger z = c.modPow(d, N);
        System.out.println("z = " + z);
        System.out.println("Correct? " + s.equals(z));

    }
}
