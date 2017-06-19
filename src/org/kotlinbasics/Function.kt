package org.kotlinbasics

fun main(args: Array<String>) {
	
	//  declaration 1
	fun greeting1(message : String) = "Function $message"
	println(greeting1("declaration 1"))
	
	// declaration 2	
	fun greeting2(message : String ) : String{
		return "function $message"
	}
	println(greeting2("declaration 2"))
	
	// declaration 3 also called as extention functions 
	fun String.greeting3(): String {
		return "Function ${this}"
	}
	val message ="declaration 3"
	println(message.greeting3())
	
}



