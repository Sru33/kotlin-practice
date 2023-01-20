fun main(){
    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("the alternating sum is $sum")
}
fun alternatingSum(vararg numbers: Int):Int{
    var sum=0
    var toggle=true
    for(number in numbers){
        if(toggle){
            sum+=number

        }
        else{
            sum-=number
        }
        toggle=!toggle
    }
    return sum
}