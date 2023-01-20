fun main () {
    val myArray= arrayOf(4,5,6,7,8,9)
    var max = myArray[0]
    for (item in myArray)
    {
        if(item > max){
            max=item
        }

    }println(max)
}