package org.kotlinbasics.Functions

// Under construction

import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo


public class AllTests {

	@Test fun tests() {
		// add
		assertThat(add(1, 2), equalTo(3))

		// pair
		val (arg1, arg2) = returnPair()
		assertThat(arg1, equalTo(10))
		assertThat(arg2, equalTo(11))

		//expression
		val result = { x: Int, y: Int -> ((x + y) * 10) }
		assertThat(result(1, 2), equalTo(30))

		val input2 = returnNumExpression(2)
		assertThat(input2(3), equalTo(8))

		
		


	}


}

