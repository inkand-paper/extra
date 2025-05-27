import kotlin.math.sqrt

fun main() {
    println("How about we find the roots of ax²+bx+c=0?")
    print("Enter your first coefficient a: ")
    val a = readLine()?.toDoubleOrNull()
    print("Enter your second coefficient b: ")
    val b = readLine()?.toDoubleOrNull()
    print("Enter your constant c: ")
    val c = readLine()?.toDoubleOrNull()
    if (a != null && b != null && c != null){
        if (a == 0.0 ){
            if (b  == 0.0 ){
                if (c == 0.0 ){
                    println("Infinite solutions")
                }
                else{
                    println("No solutions")
                }
            }
            else{
                val singleRoot: Double = - c  / b
                println("Root: $singleRoot")
            }
        }
        else{
            val upperNumber1: Double = b * b - 4 * a * c
            if (upperNumber1 < 0 ){
                println("There are no real roots!!")
            }
            else{
                val positiveUpperNumber: Double = - b + sqrt(upperNumber1)
                val negativeUpperNumber: Double = -b - sqrt(upperNumber1)
                val lowerNumber:  Double = 2 * a
                val root1: Double = positiveUpperNumber / lowerNumber
                val  root2: Double = negativeUpperNumber / lowerNumber
                println("Root1: $root1, Root2: $root2")
            }
        }
    }
    else{
        println("Invalid request!")
    }

}
