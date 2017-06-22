package org.kotlinbasics.collections

fun main(args: Array<String>) {
	
	var tennisSeedsMap = mutableMapOf(1 to "Murray", 2 to "Nadal", 3 to "Wawrinka", 4 to "Djokovic", 5 to "Federer" )
	println("Map size : ${tennisSeedsMap.size}")
	
	tennisSeedsMap.put(6, "Raonic" )
	
	tennisSeedsMap.forEach { println(it) }
	
	tennisSeedsMap.remove(6)
	
	tennisSeedsMap.forEach { println(it) }
	
	// another way of adding a values
	tennisSeedsMap[7] ="Cilic"
	
	tennisSeedsMap.forEach { println(it) }
	
}

