package day03

/**
  * 特质相当于Java 中的 接口
  *
  */
trait 特质 {
  //不赋值
  var id: Int
  //赋值
  var name: String = "笑傲冥"

  //有方法体
  def say(): Unit = {
    println(s"特质 $name")
  }

  //无方法体
  def xiao()
}

abstract class abc {
  //不赋值
  var id1: Int
  //赋值
  var name1: String = "wei"

  //有方法体
  def he(): Unit = {
    println(s"abs $name1")
  }

  //无方法体
  def sd()
}
//如果只实现特质类 使用extends 特质类 ，不使用 with
class fg extends abc with 特质 {
  override var id1: Int = 99

  override def sd(): Unit = println("hello")

  override var id: Int = 90

  override def xiao(): Unit = println("abc")
}
object 特质1{
  def main(args: Array[String]): Unit = {

    val fg = new fg()
    println(fg.name)
    println(fg.id)
    println(fg.sd())
  }
}





