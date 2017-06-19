package org.kotlinbasics

import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo

/* to get a better understanding about factorial please refere to the wiki link
 	https://en.wikipedia.org/wiki/Factorial
 */
class TestFactorial {
	

	@Test fun calculateFactorial() {

		assertThat(factorial(0), equalTo(1))
		assertThat(factorial(1), equalTo(1))
		assertThat(factorial(2), equalTo(2))
		assertThat(factorial(3), equalTo(6))
		assertThat(factorial(4), equalTo(24))
		assertThat(factorial(5), equalTo(120))
	}
}


// inline exaample 
fun factorial(n: Int): Int {
	return if (n <= 1) 1 else factorial(n - 1) * n

}
