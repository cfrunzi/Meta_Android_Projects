data class Student(val fullName: String, var id: Int, var grade: Double) {
    private val students = listOf<Student>(
        Student("John", 223,140.0),
        Student("Mark", 548,120.0),
        Student("Natali", 342,150.0),
        Student("Sara", 781,130.0)
    )

    fun main() {
    //    step 4
        println("Please, Enter the student's ID")
        val id = readln().toInt()
        println( getStudentById(id))
        println("Please, Enter the student's name")
        val name= readln()
        println(searchInStudents(name)?:"the student is not found")
    }
    //step 2
    private fun getStudentById(id:Int):Student{
        return students.find { it.id==id }!!
    }
    //step 3
    private fun searchInStudents(name:String):Student?{
        return students.find { it.fullName.lowercase()==name.lowercase()}
    }

}



