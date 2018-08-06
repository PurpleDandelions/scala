package day04.比较

/**
  * [A : B] ComtextBound
  */
class ContextBound[T: Ordering] {
  def select(first: T, second: T): T = {
    val ord: Ordering[T] = implicitly[Ordering[T]]
    if (ord.gt(first, second)) first else second
  }
}

object ContextBound {
  def main(args: Array[String]): Unit = {
    import MyPredef.OrdetIngGril
    val vb = new ContextBound[Girl]
    val g1 = new Girl("小雅", 17, 80)
    val g2 = new Girl("小蓝", 18, 90)
    val s = vb.select(g1, g2)
    println(s.name)
  }
}