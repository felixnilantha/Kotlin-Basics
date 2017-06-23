package org.kotlinbasics

import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo
import java.math.BigDecimal
import java.math.BigDecimal.ONE

/* to get a better understanding about factorial please refere to the wiki link
 	https://en.wikipedia.org/wiki/Factorial
 */
class TestFactorial {
	

	@Test fun calculateFactorial() {

		assertThat(factorial(BigDecimal(0)), equalTo(BigDecimal(1)))
		assertThat(factorial(BigDecimal(1)), equalTo(BigDecimal(1)))
		assertThat(factorial(BigDecimal(2)), equalTo(BigDecimal(2)))
		assertThat(factorial(BigDecimal(3)), equalTo(BigDecimal(6)))
		assertThat(factorial(BigDecimal(4)), equalTo(BigDecimal(24)))
		assertThat(factorial(BigDecimal(5)), equalTo(BigDecimal(120)))
		
		// if we use int for this it will give a minus value
		// at complie time it will be Kotlin Int,
		// but at run time it will become a lower case int,
		// which couldn't hold the factorial of 19,
		// we could use Big Decimal
		// also note that BigDecimal constructor doesn't have the "new" key word
		assertThat(factorial(BigDecimal(19)), equalTo(BigDecimal(121645100408832000)))
		
		// it will give a stack overflow error 
		println(factorial(BigDecimal(50_000)))
		
		                                  
	}
}


// inline exaample
// introduction to BigDecimal,and tail recursion optimisation  
tailrec fun factorial(n: BigDecimal, result: BigDecimal =ONE): BigDecimal {
	return if (n <= 1) result  else factorial(n - 1, result * n)

}

// Use of extention fucntion, key word operator is needed
// tail recursion optimisation for more info : https://stackoverflow.com/questions/33923/what-is-tail-recursion
operator fun BigDecimal.compareTo(n: Int): Int {
	return this.compareTo(BigDecimal(n))
}

operator fun BigDecimal.minus(n: Int) = this.minus(BigDecimal(n))


