package org.kotlinbasics.classes

fun main(args: Array<String>) {

	val childcareWorker = Employee("Sara Doe", "Koala Room", "Qulified", 599999999999999.62, true, true)
	childcareWorker.getEmployeeInfo().println()

	val agencyWorker = AgencyEmployee("Jane Doe", "Kangaroo Room", "Trained", 49.25, true, true, "Ranstad", "Kathie Doe")
	agencyWorker.getEmployeeInfo().println()
	agencyWorker.calculateWage(30.23).println()
}

open public class Employee(val name: String,
						   var department: String,
						   var position: String,
						   var basicSalary: Double,
						   var policCheck: Boolean?,
						   var fistAidLicence: Boolean?) {

	init {

		require(policCheck!!.xor(false)) { " Must be obtain a police clearance every year" }
		require(fistAidLicence!!.xor(false)) { " Must have a First Aid Certificate renewed very 3 years" }
	}

	open fun getEmployeeInfo(): String {

		return "$name which is in $department holding the position $position  ${if (policCheck == true) "has a valid police clearance" else "do not have valid police clearance"}"
	}


}

class AgencyEmployee(name: String,
					 department: String,
					 position: String,
					 basicSalary: Double,
					 policCheck: Boolean,
					 fistAidLicence: Boolean,
					 var agency: String,
					 var reportedTo: String) : Employee(name, department, position, basicSalary, policCheck, fistAidLicence), Wage{

	override fun getEmployeeInfo(): String {
		return "$name from $agency holding the position of $position  is reporting to $reportedTo}"
	}
	
	override fun calculateWage(hourlyRate: Double) : Double{
		
		/// cacluate salary goes here 
		
		return 875.34
	}

}




fun String.println() = println(this)
fun Double.println()= println(this)