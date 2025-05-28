fun main(){
    score()
}
fun score(){
    print("Enter your score (0-100): ")
    val score = readLine()?.toIntOrNull()
    if (score != null){
        if (score in 90..100){
            println("Grade: A")
        }
        else if (score in 80..89){
            println("Grade: B")
        }
        else if (score in 70..79){
            println("Grade: C")
        }
        else if (score in 60..69){
            println("Grade: D")
        }
        else if(score in 0..59){
            println("Grade: F")
        }
        else{
            println("Invalid request")
        }
    }
    else{
        println("Invalid request")
    }
} 
