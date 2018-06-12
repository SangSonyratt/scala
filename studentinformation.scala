object student
{
    def main(args:Array[String]): Unit=
    {
        var v1=new Studentinformation(123,"lya")
        var v2=new Studentinformation(124,"nyratt")
        var v3=new Studentinformation(125,"leapheng")
        println(v1.toString())
        println(v2.toString())
        println(v3.toString())
    }
}
class Studentinformation(id:Int, name:String)
{
    override
    def toString(): String=
    {
        return id + ":" + name
    }
}