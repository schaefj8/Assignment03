package primeOfBigInt;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Prime testing of BigInt to determine primeness!");
		
		System.out.println("================================================");
		
		System.out.println("Testing to show a composite fails:");
		System.out.println("Expected output: Failed");
		BigInteger A = BigInteger.valueOf(12);
		if(new // input().// method(A)) {
			System.out.println("Test: Passed - is a prime");
			
		} else {
			System.out.println("Test: Failed - is not a prime");
		}
		
		System.out.println("================================================");
		
		System.out.println("Testing to show a prime passes:");
		System.out.println("Expected output: Passed");
		BigInteger B = BigInteger.valueOf(13);
		if(new // input().// method(B)) {
			System.out.println("Test: Passed - is a prime");
			
		} else {
			System.out.println("Test: Failed - is not a prime");
		}
		
		System.out.println("================================================");
		
		System.out.println("Testing to show a BigInt prime is efficient and passes:");
		System.out.println("Expected output: Passed");
		BigInteger C = BigInteger.valueOf(122949829);
		if(new // input().// method(B)) {
			System.out.println("Test: Passed - is a prime");
			
		} else {
			System.out.println("Test: Failed - is not a prime");
		}
		
		System.out.println("================================================");
		
		System.out.println("Testing to show a BigInt prime passes as an extreme:");
		System.out.println("Expected output: Passed");
		BigInteger D = BigInteger.valueOf(879190841);
		if(new // input().// method(D)) {
			System.out.println("Test: Passed - is a prime");
			
		} else {
			System.out.println("Test: Failed - is not a prime");
		}
	}
}
