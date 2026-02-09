import java.math.BigInteger;
import java.util.Random;

public class mainTestC1 {
    public static void main(String[] args) {
        Euklides_Algorithm euA = new Euklides_Algorithm();

        Random rand = new Random();

        BigInteger a = new BigInteger(512, rand);
        BigInteger m = new BigInteger(512, rand);
        System.out.println("a is: " + a);
        System.out.println("m is: " + m);

        try {
            BigInteger inverse = euA.inverseMod(a, m);
            System.out.println("Inverse. " + inverse);
            System.out.println("check = " + a.multiply(inverse).mod(m));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }
}
