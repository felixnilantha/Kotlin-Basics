package org.kotlinbasics

// this will print the message from HelloJava.java 

fun main(args: Array<String>) :Unit{
	HelloJava.greetingFromJava().println()
}

fun String.println()=println(this)
