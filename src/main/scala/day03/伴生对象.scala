package day03

/**
  *
  * 与类名相同并且用object修饰的对象
  * 类和其半生对象之间可以相互访问私有的方法和属性
  */
class 伴生对象 {
  private var name = "二哈"
  def  getName() = {
    println(伴生对象.DOG + name)
  }
}
object 伴生对象{
  private var DOG = "ou ou uuuuu"
  def main(args: Array[String]): Unit = {
        val ps = new 伴生对象
    println(ps.name)
    ps.name = "金毛"
    ps.getName()
    println(ps.name)
  }
}