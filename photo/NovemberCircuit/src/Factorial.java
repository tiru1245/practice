import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(factorial(new BigInteger(n)));
	}

	private static  BigInteger factorial(BigInteger bigInteger) {
		if(bigInteger.equals(new BigInteger("0"))) {
			return new BigInteger("1");
		}
		else
			return bigInteger.multiply(factorial(bigInteger.subtract(new BigInteger("1"))));
}
}
