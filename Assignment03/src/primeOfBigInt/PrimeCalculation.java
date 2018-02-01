package primeOfBigInt;

import java.math.BigInteger;

public class TestPrime {
**
 * Name: Josh Yaggi
 * Assignment: Assignment03
 * Due Date: 2/01/18
 * Description: Used to test the if numbers are prime
 */

package assignment03;
  /**
	 * @param Huge A BigInteger
	 * @return True or False if BigInteger is a prime
	 */
	public boolean isBigPrime(BigInteger Huge) {
        if (Huge.compareTo(new BigInteger("2")) < 0) return false;
        else if (Huge.compareTo(new BigInteger("2")) == 0) return true;
        for (BigInteger i = new BigInteger("2"); i.compareTo(Huge.divide(new BigInteger("2"))) < 0; 
        	i = i.add(BigInteger.ONE))
            if (Huge.mod(i).equals(BigInteger.ZERO))
                return false;
        return true;
		} 
}
	
