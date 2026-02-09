import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RabinMiller rabinMiller = new RabinMiller();

        ArrayList<BigInteger> primes512 = rabinMiller.generatePrimes(512, 4);
        // ArrayList<BigInteger> primes1024 = rabinMiller.generatePrimes(1024, 100);
        // ArrayList<BigInteger> primes2048 = rabinMiller.generatePrimes(2048, 100);
        // ArrayList<BigInteger> primes4096 = rabinMiller.generatePrimes(4096, 100);

    }

}