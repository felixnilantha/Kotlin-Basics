package org.kotlinbasics.Functions

// Under construction
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo


public class AllTests {

	fun tests() {
		// add
		assertThat(add(1, 2), equalTo(3))

		// pair
		val (arg1, arg2) = returnPair()
		assertThat(arg1, equalTo(10))
		assertThat(arg2, equalTo(11))

		//expression
		val result = { x: Int, y: Int -> ((x + y) * 10) }
		assertThat(result(1, 2), equalTo(30))
	}


}

