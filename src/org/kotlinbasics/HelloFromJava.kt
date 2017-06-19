package org.kotlinbasics

fun main(args: Array<String>) :Unit{
	HelloJava.greetingFromJava().println()
}

fun String.println()=println(this)
