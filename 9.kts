val ip= readLine()?.toInt()
if(ip!=null){
    if(ip < 18)
    {
        println("not an adult")
    }
    else if(ip > 18 )
    {
        println("you are an adult")
    }
    else if(ip >75)
    {
        println("you are old!!")
    }}