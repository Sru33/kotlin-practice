fun main(){
    val list= listOf(1,2,3,4,5,6)
    println("the product of $list is ${list.product()}")
}
fun List<Int>.product():Int{
    var result=1
    for(value in this){
        result*=value
    }
    return result
}