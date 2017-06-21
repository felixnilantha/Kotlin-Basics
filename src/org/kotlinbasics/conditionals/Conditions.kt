package org.kotlinbasics.conditionals

import java.util.Random

fun main(args: Array<String>) {
	
	
	// if else 
	val workExperiance = 21
	if((workExperiance<=5) && (workExperiance>=0) ){
		println("Entry-Level Developer")
	}else if((workExperiance<=10) && (workExperiance>5) ){
		println("Mid-Career Developer")
	}else if((workExperiance<=20) && (workExperiance>10) ){
		println("Experianced Developer")
	}else if (workExperiance>20){
		println("Late-Career Developer")
	}
	
	//when else
	when(workExperiance){
		
		0,1,2,3,4,5 -> println("Entry-Level Developer")
		6,7,8,9,10 -> println("Mid-Career Developer")
		in 11..20 -> println("Experianced Developer")
		else -> println("Late-Career Developer")
	}
	
	
	// for
	for(x in 1..10){
		if(x % 2 == 0){
			continue
		}
		
		println("Odd : = $x")
		
		if (x==7) break
	}
	
	
	// looping through an Array
	
	var intArray: Array<Int> = arrayOf(1,2,3,4,5)
	
	for(i in intArray.indices){
		println(intArray[i])
	}
	
	
	// looping through indexes 
	for((index, value) in intArray.withIndex()){
		println("Index : ${index} value : ${value}" )
	}
	
	
	// while
	val random = Random().nextInt(10) + 1
	var number =0
	
	while(random != number){
		number+=1
	}
	
	println("Random number is $number")
	
	
	
	
}