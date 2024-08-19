@main def main():Unit = {
    val userInput = scala.io.StdIn.readLine("Enter a number: ").toInt

    val output:Int => Unit = userInput => userInput match {
        case x if x<=0 => println("Negative/Zero")
        case x if x%2 == 0 => println("Even")
        case x if x%2 != 0 => println("Odd")
    }

    output(userInput)
}