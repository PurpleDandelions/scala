package day04.比较

/**
  *
  * 上界 UpperBound
  */
class UpperBound[T <: Comparable[T]] {
  def select(first: T, second: T): T = {
    if (first.compareTo(second) > 0) first else second
  }
}

class MyGirl(val name: String, val faceValue: Int) extends Comparable[MyGirl] {
  override def compareTo(o: MyGirl): Int = {
    this.faceValue - o.faceValue
  }
}

object UpperBound {
  def main(args: Array[String]): Unit = {
    val ub = new UpperBound[MyGirl]
    val g1 = new MyGirl("小雅", 99)
    val g2 = new MyGirl("小芳", 98)

    val bj = ub.select(g1, g2)
    println(bj.name)
  }
}