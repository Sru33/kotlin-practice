fun main(){
    println("enter 5 numbers")
    val list = mutableListOf<Int>()
    for(i in 1..10){
        val x= readLine()?.toInt()
        if(x!=null){
            list.add(x)
        }
}}