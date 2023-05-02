fun main() {

   introduction("cynthia",20, "akirachix")
    division(4,2)
    userInformation("Esther",21,"Kenya")
 println(addition(10,20,40,60,))
    println(averageNumber(10,20,30,40,50))

    //You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)


    var fullName : String= "Diana Mutesi"
    println(fullName)
    var age : Int= 30
    println(age)
    var phoneNumber : String= "07289409812"
    println(phoneNumber)
    var email = "dianamutesi@gmail.com"
    println(email)
    var weight :Double = 78.4
    println(weight)
    var ugandan : Boolean = true
    println(!ugandan)

}
 fun introduction(name: String,age: Int,school: String){
     println("my name is $name and i am $age years old and i go to $school")
 }
fun division(num1: Int,num2: Int){
    var result = num1/num2
   println(result)
}
//1. Create and invoke a function that takes in a users name, age, and nationality and
// prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)

fun userInformation(name: String,age: Int,nationality: String){
    println("Hello my name is $name, i am $age years old and i am from $nationality")
}
//Create and invoke a function that returns the sum of any given 4 numbers (3 points)

fun addition(num1:Int,num2: Int,num3:Int,num4:Int) :Int{
    var sum = num1+num2+num3+num4

    return sum
}
//Create and invoke a function that given any 5 numbers, it returns their average (2 points)

fun averageNumber(num1: Int,num2: Int,num3: Int,num4: Int,num5:Int): Int{
     var output = (num1+num2+num3+num4+num5)/5
    return output
}


