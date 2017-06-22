package org.kotlinbasics.collections


fun main(args: Array<String>) {
	
	val immutableList: List<String> = listOf("Sydney", "Melbourne", "Perth", "Adelaide", "Darwin", "Hobart")
			
	var mutableList: MutableList<String> = mutableListOf("NSW", "VIC", "SA", "NT", "QLS", "TAZ")
	
	println("First Item: ${mutableList.first()}")
	println("First Item: ${mutableList.last()}")
	
	
	// subList
	
	var firstThree = mutableList.subList(0,3)
	firstThree.forEach { println(it) }
	
	// size
	
	println("Size: ${mutableList.size}")
	
	mutableList.removeAt(1)
	mutableList.forEach { println(it) }
	
	
}


