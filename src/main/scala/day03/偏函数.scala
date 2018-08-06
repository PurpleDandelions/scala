package day03

/**
  * PartialFunction[A,B] : A为参数类型 B为返回值类型
  * PartialFunction（偏函数）：常用作输入模式匹配
  *
  */
object 偏函数 {
def m1 : PartialFunction[String,Int] = {
  case "one" => {
    println("case 1")
    1
  }
  case "town" => {
    println("twon")
    2
  }
  }

  def m2(num: String) : Int = num match {
    case "one" => 0
    case _ => 2
  }

  def main(args: Array[String]): Unit = {
    println(m1("one"))
    println(m2("er"))
  }
}
