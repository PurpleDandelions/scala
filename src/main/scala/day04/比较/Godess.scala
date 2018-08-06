package day04.比较

/**
  *
  * Scala 比较没有提供特定的比较规则，提供了接口，通过实现接口里面的方法来实现比较
  */
object ImplicitContext {
//比较规则
  implicit object OderingGirl extends Ordering[Gril] {
    override def compare(x: Gril, y: Gril): Int = {
      if (x.faceValue > y.faceValue) 1 else -1
    }
  }

}
//比较对象
class Gril(val name: String, var faceValue: Int) {
  override def toString: String = s"name:$name,faceValue:$faceValue"
}
//比较方法
class Goddess[T: Ordering](val v1: T, val v2: T) {
  def choose()(implicit ord: Ordering[T]) = if (ord.gt(v1, v2)) v1 else v2

}

object Gril {
  def main(args: Array[String]): Unit = {
    import ImplicitContext.OderingGirl
    val g1 = new Gril("小雅", 99)
    val g2 = new Gril("小芳", 98)
    val res = new Goddess(g1, g2)
    println(res.choose().name)
  }
}