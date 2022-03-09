package ITforstudent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
//import java.util.Iterator;
//import java.util.Scanner;

public class baitap {
	
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(sc.readLine());
		for(int i = 0; i < T; i++ ) {
			BigInteger n = new BigInteger(sc.readLine());
			if(n.isProbablePrime(1))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}