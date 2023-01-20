fun main(){
    val a=3.0
    val b=4.0
    val height=2.0
    val parallellogram=object:Shape("Parallelogram",a,b,height)
}
init{
    println("parallelogram created with a=$a,b=$b and height=$height")
    println("the area is ${area()}")
    println("the perimeter is${perimeter()}")
}
override fun area():Double{
    return a*height
}
override fun perimeter():Double{
    return 2*a+2*b
}
fun isRectangle():Boolean=height==b