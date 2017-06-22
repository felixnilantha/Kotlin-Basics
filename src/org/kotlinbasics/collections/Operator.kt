package org.kotlinbasics.collection


fun main(args: Array<String>) {
	
	val numList = 1..5
	
	val oddList = arrayOf(1, 3, 5, 7)
	
	// reduce
	
	val reduceSum = numList.reduce{x, y -> x + y}
	println(" Sum on reduce : $reduceSum")
	
	// fold
	
	val foldSum = numList.fold(5){x, y -> x + y}
	println(" Sum on fold : $foldSum")
	
	// any
	
	println("Odd :  ${numList.any { it % 2 != 0 }}")
	
	// all
	println("Odd :  ${numList.all { it % 2 != 0 }}")	
	println("All Odd :  ${oddList.all { it % 2 != 0 }}")
	
	// filter
	
	val filterEven = numList.filter { it % 2 == 0 }
	filterEven.forEach { println(it) }
	
	// map
	
	val multiplyBy2 = numList.map { it * 2 }
	multiplyBy2.forEach { println(it) }
	
	
}
