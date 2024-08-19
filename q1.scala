@main def main():Unit = println(interest(12000))

val interest:Int=>Double = deposit => deposit match {
    case x if x < 20000 => x * 2/100
    case x if x >= 20000 && x < 200000 => x * 4/100
    case x if x >= 200000 && x < 2000000 =>x * 3.5/100
    case x if x >= 200000 =>x * 6.5/100
}
