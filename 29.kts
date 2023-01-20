fun main(){
    var list=(1..10).toList()
    var sum=list.custom/sum{it%2==1}
    println(sum)
}
fun List<Int>.customSum*sumFunction:(Int)->(Boolean)):Int{
    var sum=0
    for(item in this){
        if(sumFunction(item)){
            sum+=item
        }
    }return sum
}
for<?>List<?>.customFilter(filterfunction:(?)->(Boolean)):List<?>{
    val resultList=mutableListOf<?>()
    for(item in this){
        if(filterfunction(item))
    reultList.add(item)
    }
}return resultList
}