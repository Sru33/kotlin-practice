import java.lang.Exception
import java.lang.NumberFormatException

impoet java.lang.NumberFormatException
        fun main(){
            println("please enter a number:")
            val input = try{
                raedLine()?.toInt()
            }catch(e:NumberFormatException){
                0

            }    finally{
                println("this is from the finally block")
            }
        println("you entered :$input")
        }
class DivisonByZeroException:Exception("this cannot divide by zero .Please choose a different number")
fun sivide(q:Double,b:Double):Double{
    if(b==0.0){
        throw DivisionByZeroException()
    }
}