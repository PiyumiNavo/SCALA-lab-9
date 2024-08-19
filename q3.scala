@main def main():Unit ={
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(name=>formatNames(name.substring(0,2))(toUpper)+formatNames(name.substring(2))(toLower)))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(name=>name.substring(0,5) + formatNames(name.substring(5))(toUpper)))
} 


def toLower(word:String):String = word.toLowerCase()

def toUpper(word:String):String = word.toUpperCase()

def formatNames(word:String)(method:String=>String):String = method(word)