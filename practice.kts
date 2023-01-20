fun main() {
    println("hellooooooo!!!!")
    println("hey guys")
    var myVariable: Boolean = true
    println("the value of variable is:$myVariable")
    myVariable = false
    println(myVariable)
    var m = 15
    var n = 7
    println(m == n)
    m += 10
    val result = m + n
    println("the result is :${m + n}")
    println(8 + 6)
    var k = 20.15F
    var l = 8F
    println(k / l)
    val h = 10
    val string = "this is an example text"
    println(" the string is ${string.toUpperCase().toLowerCase()}")
    val q = 5
    val w = 7
    if (q < w) {
        println("x is lesser than y")
    }
    println("this will always be executed")
    val userInput = readLine()
    println("you entered $userInput")
    println(userInput?.toUpperCase())
    if(userInput!=null)
        println(userInput.toInt()-5)
    val myArray = arrayOf("hello","guys","what's up")
    println(myArray[0])
    for(i in 1..3){
        println(i)
    }
    for(i in 10 downTo 5){
        println(i)
    }
    for(i in 'a'..'z'){
        println(i)
    }
    val myarray = arrayOf(4,5,6,7,8,9)
    var max = myarray[0]
    for(item in myarray){
        if(item >max) {
            max = item
        }
    }
    println(max)
    var o= readLine()?.toInt()
    var ok= readLine()?.toInt()
    var av=1
    var il=0
    while(o!=null && ok!=null && il<ok)
    {
        av*=o
        il++
    }

    println("the avg is $av ")

    val list = mutableListOf<Int>()
    for(i in 1..10){
        val x= readLine()?.toInt()
        if(x!=null){
            list.add(x)
        }

    }


}