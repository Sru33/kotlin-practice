fun main(){
    println("enter 5 numbers")
    val list = mutableListOf<Int>()
    for(i in 1..10){
        val x= readLine()?.toInt()
        if(x!=null){
            list.add(x)
        }
}
println("the 5 nos in reverse order are:")
    for(i in list.size - 1 downTo 0){
        println(list[i])
    }
}