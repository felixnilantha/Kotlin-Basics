package org.kotlinbasics.Functions

import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo
import org.junit.runner.RunWith


fun main(args: Array<String>) {

	//  declaration 1
	fun greeting1(message: String) = "Function $message"
	println(greeting1("declaration 1"))

	// declaration 2	
	fun greeting2(message: String): String {
		return "function $message"
	}
	println(greeting2("declaration 2"))

	// declaration 3 also called as extention functions 
	fun String.greeting3(): String {
		return "Function ${this}"
	}

	val message = "declaration 3"
	println(message.greeting3())


	// creating our own fucntions

	fun String.println() = println(this)
	val customPrintMessage = "Custom Print line"

	customPrintMessage.println()


	// Default values for parameters

	fun greeting4(message: String = " Defaul value"): String {

		return "This is the $message"
	}
	// This will print the default value
	println(greeting4())


	// add function
	println("x + y result for 1 + 2 is ${add(1, 2)}")
	// sum default value
	println("x + y result for default value is ${add()}")

	// return pair	
	val (arg1,arg2) = returnPair(1)
	println("$arg1 and $arg2")

	// sum values
	println("Sum = ${sum(1,2,3,4,5)}")
	
	// expression
	
	val result = {x: Int, y : Int -> ((x + y) * 10)}
	println("result is ${result(1,2)}")
	

}


// function can be private and internal, by default everything is public 

private fun privateFunction(message: String = "function"): String {
	return "private $message"
}

internal fun internalFunction(message: String = "function"): String {
	return "internal $message"
}

fun add(x: Int = 1, y: Int = 1): Int = x + y

fun returnPair(n: Int = 10): Pair<Int, Int> {
	return Pair(n, n + 1)
}


fun sum(vararg n : Int) : Int{
	
	var sum=0
	n.forEach { x -> sum += x }
	
	return sum
}


