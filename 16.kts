fun main()
{
println("where are u from?")
    val country = readLine()
    when(country){
        "India" -> println("namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        "Russia" -> println("privet")
        else -> println("i dont know that")
    }
}