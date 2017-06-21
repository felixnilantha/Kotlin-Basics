package org.kotlinbasics.datatypes

fun main(args: Array<String>) {
	// Read Only or Immutable 
	val name = "Nilantha"
	
	// mutable 
	var age =30
	
	var bigInt: Int =Int.MAX_VALUE
	var smallInt: Int =Int.MIN_VALUE
	
	println("Biggest Int : " + bigInt)
	// example of String interpolation 
	println("Smallest Int : $smallInt" )
	
	var bigLong: Long =Long.MAX_VALUE
	var smallLong: Long =Long.MIN_VALUE
	
	println("Biggest Long : " + bigLong)
	// example of String interpolation 
	println("Smallest Long : $smallLong" )
	
	var bigDouble: Double =Double.MAX_VALUE
	var smallDouble: Double =Double.MIN_VALUE
	
	println("Biggest Long : " + bigDouble)
	// example of String interpolation 
	println("Smallest Long : $smallDouble" )
	
	var bigFloat: Float =Float.MAX_VALUE
	var smallFloat: Float =Float.MIN_VALUE
	
	println("Biggest Long : " + bigFloat)
	// example of String interpolation 
	println("Smallest Long : $smallFloat" )
	
	// aquracy of precesions will not be garrenteed after 15 digits
	
	var dblnum1: Double = 1.1111111111111111
	var dblnum2: Double = 1.1111111111111111
	
	println("sum :" + (dblnum1+dblnum2))
	// Answer would be sum :2.2222222222222223
	
	
	//Boolean
	
	if(true is Boolean)
		println("true should be printed")
	
	//Char
	
	var printChar : Char ='A'
	println("Printing charactor :" + printChar )
	
	
	
}

