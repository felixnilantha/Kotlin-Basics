package org.kotlinbasics.arrays

fun main(args: Array<String>) {
	// Type specified 
	var intArray: Array<Int> = arrayOf(1,2,3)
	intArray.forEach { println(it) }

	// Type not specifid 
	var myArray =arrayOf("Nilantha", 30, 55.62)
	
	// this will print the index 1 which is Int 30
	println(myArray[1])
	
	myArray[2] =62.32
	
	// array is mutable and the value of the index 2 will be changed
	println(myArray[2])
	
	// Array size
	// this will print 3
	println("Array length : ${myArray.size}")
	
	// This will print values of index 0 and 1
	var copyRange = myArray.copyOfRange(0,2)
	copyRange.forEach { println(it) }
	
	// this will print the first eliment 
	println("First : ${myArray.first()}")
	
	// this will print the index 0
	println("Index of Nilantha : ${myArray.indexOf("Nilantha")}")
	
	// this will print a Array of cubes
	
	var cubeArray = Array(4,{x -> x*x*x})
	cubeArray.forEach { println(it) }
	
	
	
	
	
}




