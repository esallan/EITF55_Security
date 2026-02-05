import java.math.BigInteger;

public class mainProposal {
    public static void main(String[] args) {
        RSA_Program rsa = new RSA_Program();

        BigInteger a = BigInteger.valueOf(6);
        BigInteger m = BigInteger.valueOf(12);

        try {
            BigInteger check = rsa.inverseMod(a, m);
            System.out.println("Inverse. " + check);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
