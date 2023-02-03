fun main() {

    //used while loop to give the user to make the decision to quit converting
    var repeat = true
    while(repeat){
        print("Enter number you want to convert : ")
        val num = readLine()!!.toFloat()
        print("Enter the unit of current measurement(km, meter, cm, inch, kg, lb, gram, ounce, celsius, fahrenheit) : ")
        val unit = readLine()
        var convertToUnit = "fahrenheit"

        //if the user want to convert from Celsius or Fahrenheit they are prompt to enter the unit they want to convert
        if(unit == "celsius" || unit == "fahrenheit"){
            print("Enter the unit that you wish to convert (kelvin, fahrenheit, celsius) :")
            convertToUnit = readLine().toString()
        }
        var result = ""
        when(unit){
            "km" -> result = "$num $unit = ${0.62 * num} meter"
            "meter" -> result = "$num $unit = ${1.61 * num} km"
            "cm" -> result = "$num $unit = ${0.39 * num} inch"
            "inch" -> result = "$num $unit = ${2.54 * num} cm"
            "kg" -> result = "$num $unit = ${2.2 * num} lb"
            "lb" -> result = "$num $unit = ${0.45 * num} kg"
            "gram" -> result = "$num $unit = ${0.04 * num} oz"
            "ounce" -> result = "$num $unit = ${28.35 * num} gram"

            //if the user want to convert from celsius to kelvin or fahrenheit
            //check the convertToUnit variable and performed operation
            "celsius" -> if(convertToUnit == "fahrenheit"){
                    result = "$num $unit = ${(num * (9.0/5)) +32} fahrenheit"
                }
                else if (convertToUnit == "kelvin"){
                    result = "$num $unit = ${num + 273.15} kelvin"
                }
            //just like celsius convertion same logic used for fahrenheit
            "fahrenheit" -> if(convertToUnit == "celsius"){
                    result = "$num $unit = ${((num - 32) * (5.0/9))} celsius"
                }
                else if(convertToUnit == "kelvin"){
                    result = "$num $unit = ${((num - 32) * (5.0/9)) + 273.15} kelvin"
                }
            else -> print("invalid input! try again")
        }
        println(result)

        print("Enter 'q' to exit, or any other key to continue converting: ")
        val exit = readLine()
        if(exit == "q"){
            repeat = false
        }
    }
}
