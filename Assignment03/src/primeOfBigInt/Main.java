package primeOfBigInt;

import java.math.BigInteger;

/**
 * A Main method testing the TestPrime class for correctness in determining a BigInt prime.
 * @author Jacob Schaefer
 * Due Date: 2/01/2018
 * Computer Programming 2
 * 
 */

public class Main {

	public static void main(String[] args) {
		/**
		 * Pass and Fail counter
		 */
		// Fail and Pass declared as integer and initialized as zero
		int Fail = 0;
		int Pass = 0;
		
		// Output stating testing of BigInt
		System.out.println("Prime testing of BigInt to determine primeness!");
		
		// Output of test separation
		System.out.println("================================================");
		
		/**
		 * Testing if BigInteger passes as a composite
		 */
		// Output stating what is being tested
		// Output of expected result
		// if statement testing if BigInteger is a prime using TestPrime method
		// if test fails the Fail count adds 1
		// if the test passes the Pass count adds 1
		System.out.println("Testing to show a composite fails:");
		System.out.println("Expected output: Failed");
		BigInteger A = BigInteger.valueOf(12);
		if(new TestPrime().isBigPrime(A)) {
			System.out.println("Test: Passed - is a prime");
			Pass++;
			
		} else {
			System.out.println("Test: Failed - is not a prime");
			Fail++;
		}
		
		// Output of test separation
		System.out.println("================================================");
		
		/**
		 * Testing if BigInteger passes as prime
		 */
		// Output stating what is being tested
		// Output of expected result
		// if statement testing if BigInteger is a prime using TestPrime method
		// if test fails the Fail count adds 1
		// if the test passes the Pass count adds 1
		System.out.println("Testing to show a prime passes:");
		System.out.println("Expected output: Passed");
		BigInteger B = BigInteger.valueOf(13);
		if(new TestPrime().isBigPrime(B)) {
			System.out.println("Test: Passed - is a prime");
			Pass++;
			
		} else {
			System.out.println("Test: Failed - is not a prime");
			Fail++;
		}
		
		// Output of test separation
		System.out.println("================================================");
		
		/**
		 * Testing if BigInteger passes as a zero
		 */
		// Output stating what is being tested
		// Output of expected result
		// if statement testing if BigInteger is a prime using TestPrime method
		// if test fails the Fail count adds 1
		// if the test passes the Pass count adds 1
		System.out.println("Testing to show that zero does not pass:");
		System.out.println("Expected output: Failed");
		BigInteger E = BigInteger.valueOf(0);
		if(new TestPrime().isBigPrime(E)) {
			System.out.println("Test: Passed - is a prime");
			Pass++;
			
		} else {
			System.out.println("Test: Failed - is not a prime");
			Fail++;
		}
		
		// Output of test separation
		System.out.println("================================================");
		
		/**
		 * Testing if BigInteger passes as a negative
		 */
		// Output stating what is being tested
		// Output of expected result
		// if statement testing if BigInteger is a prime using TestPrime method
		// if test fails the Fail count adds 1
		// if the test passes the Pass count adds 1
		System.out.println("Testing to show a prime as a negative does not pass:");
		System.out.println("Expected output: Failed");
		BigInteger F = BigInteger.valueOf(-13);
		if(new TestPrime().isBigPrime(F)) {
			System.out.println("Test: Passed - is a prime");
			Pass++;
			
		} else {
			System.out.println("Test: Failed - is not a prime");
			Fail++;
		}
		
		// Output of test separation
		System.out.println("================================================");
		
		/**
		 * Testing if BigInteger passes as a negative
		 */
		// Output stating what is being tested
		// Output of expected result
		// if statement testing if BigInteger is a prime using TestPrime method
		// if test fails the Fail count adds 1
		// if the test passes the Pass count adds 1
		System.out.println("Testing to show a BigInt negative does not pass:");
		System.out.println("Expected output: Failed");
		BigInteger G = BigInteger.valueOf(-122949829);
		if(new TestPrime().isBigPrime(G)) {
			System.out.println("Test: Passed - is a prime");
			Pass++;
			
		} else {
			System.out.println("Test: Failed - is not a prime");
			Fail++;
		}
		
		// Output of test separation
		System.out.println("================================================");
		
		/**
		 * Testing if BigInteger passes as a prime
		 */
		// Output stating what is being tested
		// Output of expected result
		// if statement testing if BigInteger is a prime using TestPrime method
		// if test fails the Fail count adds 1
		// if the test passes the Pass count adds 1
		System.out.println("Testing to show a BigInt prime is efficient and passes:");
		System.out.println("Expected output: Passed");
		BigInteger C = BigInteger.valueOf(122949829);
		if(new TestPrime().isBigPrime(B)) {
			System.out.println("Test: Passed - is a prime");
			Pass++;
		} else {
			System.out.println("Test: Failed - is not a prime");
			Fail++;
		}
		
		// Output of test separation
		System.out.println("================================================");
		
		/**
		 * Testing if BigInteger passes as an extreme BigInteger prime
		 */
		// Output stating what is being tested
		// Output of expected result
		// if statement testing if BigInteger is a prime using the TestPrime method
		// if test fails the Fail count adds 1
		// if the test passes the Pass count adds 1
		System.out.println("Testing to show a BigInt prime passes as an extreme:");
		System.out.println("Expected output: Passed");
		BigInteger D = BigInteger.valueOf(879190841);
		if(new TestPrime().isBigPrime(D)) {
			System.out.println("Test: Passed - is a prime");
			Pass++;
		} else {
			System.out.println("Test: Failed - is not a prime");
			Fail++;
		}
		
		/**
		 * Testing box counter for Failed and Passed tests
		 */
		// Output in a box of total passed and failed tests
		System.out.println("------------------------");
		System.out.println("|" + "Total test's passed: " + Pass + "|");
		System.out.println("|" + "Total test's failed: " + Fail + "|");
		System.out.println("------------------------");
	}
}
