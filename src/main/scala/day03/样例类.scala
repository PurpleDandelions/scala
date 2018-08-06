package day03

import scala.util.Random

object 样例类 {
  def main(args: Array[String]): Unit = {
    val arr = Array(Hu,He(12,"wei"),Jiao("wang"))
    arr(Random.nextInt(arr.length)) match {
      case Jiao(a) => println("jiao")
      case He(a,b) => println("he")
      case _ => println("wu")
    }
  }
}
//case class 一般是多例 需要构造参数
case class Jiao(jiao:String)
case class  He(id:Int,name:String)
//case object 一般是单例
case object  Hu