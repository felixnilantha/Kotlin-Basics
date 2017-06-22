package org.kotlinbasics.Functions

/* Higher-order function
  	√ Takes one or more functions as aguments
    √ return a function as it result
 for more information please refer: #https://en.wikipedia.org/wiki/Higher-order_function
 
 */

fun main(args: Array<String>) {
	
	// find even value
	
	val numList = 1..100
	val evenList = numList.filter { it % 2 == 0 }
	evenList.forEach { println(it) }
	
	 val input1 = returnNumExpression(1)
	println("1 + 10 * 1 is ${input1(10)}")
	
	val calculateCube = {x: Int -> x * x * x}
	val intArray = arrayOf(1,2,3)
	manipulateList(intArray, calculateCube)
	
	
}

fun returnNumExpression(x: Int): (Int) -> Int= {c -> x * (c + 1)}

//function receieving a list and function to use on the list item

fun manipulateList(intList: Array<Int>, nFunc: (n: Int) -> Int){
	for (n in intList){
		nFunc(n)
	}
}