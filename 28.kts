fun main(){
    val a=3.0
    val b=4.0
    val c=5.0
    val d=4.0
    val height = 3.87298
    val trapeze = object:Shape("trapeze",a,b,c,d,height){
        override fun area():Double{
            return (a+c)*height/2.0
        }
        override fun perimeter():Double{
            return a+b+c+d
        }
        fun isRectangle():Boolean=a==c&&b==d
    }
}