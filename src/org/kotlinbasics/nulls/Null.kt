package org.kotlinbasics.nulls

fun main(args: Array<String>) {
	
	// null is built in to kotlin
	
	var value : String? = null;
	
	var value1 = returnNull()
	
	if (value1 != null){
		println(" not null")
	}
	// forceing it print the value it could be null
	var value2 =value!!.length // this will give a null pointer expecption
	
	var value3 = returnNull() ?: "gives a default value"
	println(value3)
}

// ? is an indecation that this fucntion may return null
fun returnNull(): String?{
	
	return null;
}