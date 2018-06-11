object test1
{
    def main(args:Array[String])
    {    
        var a=0;
        for(a <- 0 to 10)
        {
            if(a%2==0)
            {
                 println("the even number is:"+a)
            }
            else
            {
                println("the odd number is:"+a)
            }
        }
    }
}