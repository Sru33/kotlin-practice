fun main(){
    sumUpToN(10)
}
fun sumUpToN(n: Int){
    var result = 0
        for (i in 1..n){
            result+=1
        }
    println("the sum of the values 1 to $n is $result")
}