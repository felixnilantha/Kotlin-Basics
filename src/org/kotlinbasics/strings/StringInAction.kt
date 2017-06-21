package org.kotlinbasics.strings


fun main(args: Array<String>) {
	// Read Only String
	val myName = "Nilantha Silva"
// Read Only mutli line long string 
	val longString = """ This  is a multi
 		line long String"""

// String mutability

	var firstName = "John"
	var lastName: String = " Doe"
	var gender: String = "Male"

	firstName = "Jane"
	gender="Female"
	var fullname =firstName + lastName
	var profile = "$fullname is a $gender"
	
	// printing value 'Jane Doe is a Female'
	println(profile)
	
	// Arithmetic interpolation inside a String
	// printing value '1 + 2 is equal to 3'
	val addValue ="1 + 2 is equal to ${1+2}"
	println(addValue)
	
	// String length
	// printing value 37
	println("Length of the long string example is : ${longString.length}")
	
	// compare two strings with equals
	
	var str1 = "Kotlin ROCKS"
	var str2 ="Kotlin Rocks"
	val str3 ="Kotlin Rocks"
	// output 'false'
	println("Statement of equality for str1 and str2 hapence to be  : ${str1.equals(str2)}")
	
	//output 'true'
	println("Statement of equality for str2 and str3 hapence to be  : ${str2.equals(str3)}")
	
	// compare two strings with CompareTo
	// printing a minus(-) value -32
	println("Comparision between str1 and str2 should be ${str1.compareTo(str2)}")
	//printing Zero (0)
	println("Comparision between str2 and str3 should be ${str2.compareTo(str3)}")
	
	// String indexing
	
	// printing value 'K'
	println("O st index of str1 : ${str1.get(0)}")
	// printing value 'Rocks'
	println("Index 6 to 11 of str2 : ${str2.subSequence(6,12)}")
	
	// Searching through a string
	val searchContains :String =" Presence is the way of life "
	// printing value 'true'
	println("Contains the value Presence is ${searchContains.contains("Presence")}")
}
