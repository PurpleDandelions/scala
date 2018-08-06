package day04
object Curry{
  implicit val a = "java"
  implicit val b = "scala"
}
object CurryDemo {
  def m1(a:Int)(implicit b:String) = a+b
  def main(args: Array[String]): Unit = {
    import Curry.a
    println(m1(99))

  }
}
