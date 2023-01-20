fun main(){
    val list= listOf(3,2,5,1,5,6,7)
    println("the list looks like the following: $list")
    print("Search for this number:")
    val input = readLine()?.toInt()
    if(input!=null){
        println("the index of $input is ${indexOf(list,input)}")
    }
}
fun indexOf(list:List<Int>,value:Int):Int{
    for(i in 0..list.size-1){
        if(list[i]==value){
            return 1
        }
    }
    return -1
}