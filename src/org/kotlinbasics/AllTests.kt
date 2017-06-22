package org.kotlinbasics.Functions

// Under construction

import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo


public class AllTests {

	@Test fun tests() {
		// add
		assertThat(add(1, 2), equalTo(3))

		// pair
		val (arg1, arg2) = returnPair()
		assertThat(arg1, equalTo(10))
		assertThat(arg2, equalTo(11))

		//expression
		val result = { x: Int, y: Int -> ((x + y) * 10) }
		assertThat(result(1, 2), equalTo(30))

		val input2 = returnNumExpression(2)
		assertThat(input2(3), equalTo(8))

		
		// on collections
		
		val numList = 1..5
		val oddList = arrayOf(1, 3, 5, 7)

		// reduce

		val reduceSum = numList.reduce { x, y -> x + y }
		assertThat(reduceSum, equalTo(15))

		// fold

		val foldSum = numList.fold(5) { x, y -> x + y }
		assertThat(foldSum, equalTo(20))
		
		// filter
		val filterEven = numList.filter { it % 2 == 0 }
		assertThat(filterEven[1], equalTo(4))
		
		// map
		
		val multiplyBy2 = numList.map { it * 2 }
		assertThat(multiplyBy2[4], equalTo(10))
		
		// Lists
		
		var mutableList: MutableList<String> = mutableListOf("NSW", "VIC", "SA", "NT", "QLS", "TAZ")
		
		assertThat(mutableList.first(), equalTo("NSW"))
		assertThat(mutableList.last(), equalTo("TAZ"))
		assertThat(mutableList.size, equalTo(6))
		
		// sub list
		var firstThree = mutableList.subList(0,3)
		assertThat(firstThree.first(), equalTo("NSW"))
		assertThat(firstThree.last(), equalTo("SA"))
		assertThat(firstThree.size, equalTo(3))
		assertThat(firstThree.removeAt(1), equalTo("VIC"))
		
		
		// Map<key, value>
		
		var tennisSeedsMap = mutableMapOf(1 to "Murray", 2 to "Nadal", 3 to "Wawrinka", 4 to "Djokovic", 5 to "Federer" )
		assertThat(tennisSeedsMap.get(1), equalTo("Murray"))
		tennisSeedsMap.put(6, "Raonic")
		assertThat(tennisSeedsMap.get(6), equalTo("Raonic"))
		assertThat(tennisSeedsMap.remove(3), equalTo("Wawrinka"))
		
		
		
	}


}

