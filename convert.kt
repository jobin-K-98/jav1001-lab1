// It is actually a user friendly program that helps the user to do conversion many times without exiting the output terminal
fun main()
{
  var repeat = true //Boolean value returned from the 'repeat' in the last if statement
  while(repeat) //here while loop is used to either continue or quit the conversion based on user preference
  {
    println("CONVERSION PROGRAM")
    println("Enter the number you wish to convert")
    val number = readLine()!!.toFloat()
    println("Enter the unit in km, mi, cm, in, kg, lb: ")

    val unit = readLine()
    var result = when(unit)
    {
     "km" -> "$number$unit = ${0.62 * number}mi"
     "mi" -> "$number$unit = ${1.61 * number}km"
     "cm" -> "$number$unit = ${0.39 * number}in"
     "in" -> "$number$unit = ${2.54 * number}cm"
     "kg" -> "$number$unit = ${2.20 * number}lb"
     "lb" -> "$number$unit = ${0.45 * number}kg"
     else -> println("invalid input") //if the user input doesn't match with the listed value the else statement will execute

    }

   println(result)//returns the value
   println("Press q to exit and y to do further conversion") // we can enter any other value except 'q' to return the value of repeat but to make a yes feeling we tell the user to type 'y'
   val quit = readLine() //introducing a new constant that helps the user to take decision such as continue or quit
   if (quit=="q")
    {
     repeat = false
    }
  }
}