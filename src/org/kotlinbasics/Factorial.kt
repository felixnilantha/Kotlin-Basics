package org.kotlinbasics

/* to get a better understanding about factorial please refere to the wiki link
 	https://en.wikipedia.org/wiki/Factorial
 */

fun main(args: Array<String>) {
	println(factorial(0))
	println(factorial(1))
	println(factorial(2))
	println(factorial(3))
	println(factorial(4))
	println(factorial(5))
}

fun factorial(n: Int): Int {
	return if (n <= 1) {
		1
	} else {
		factorial(n - 1) * n
	}
}
