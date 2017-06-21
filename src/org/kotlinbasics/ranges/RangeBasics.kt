package org.kotlinbasics.ranges

fun main(args: Array<String>) {
	
	// this will print the range 1 to 10
	val range_1_to_10 = 1..10
	range_1_to_10.forEach{println(it)}
	
	// this will print 10 to 1
	val range_10_to_1 =10.downTo(1)
	range_10_to_1.forEach{println(it)}
	
	// this will print 72 to 100
	val range_72_to_100 = 72.rangeTo(100)
	range_72_to_100.forEach { println(it) }
	
	// step in a range and reversed	
	val rangeStep_3 =range_1_to_10.step(3).reversed()
	rangeStep_3.forEach{println(it)}
	
	// check a value within a range
	val range_A_to_Z = "A".."Z"
	println("Is Q in withis the ranage : ${"Q" in range_A_to_Z}")
	
	
}