package day04.比较

/**
  * [B <% A] ViewBound
  */
object MyPredef {
  implicit def selectGril(g: Girl) = new Ordered[Girl] {
    override def compare(that: Girl): Int = {
      if (that.faceValue == g.faceValue) that.age - g.age else g.faceValue - that.faceValue
    }
  }

  implicit val selectGril_2 = (g: Girl) => new Ordered[Girl] {
    override def compare(that: Girl): Int = {
      if (that.faceValue == g.faceValue) {
        that.age - g.age
      } else {
        g.faceValue - that.faceValue
      }
    }
  }
  implicit object OrdetIngGril extends Ordering[Girl]{
    override def compare(x: Girl, y: Girl): Int = {
      if (x.faceValue == y.faceValue){
        y.age-x.age
      }else{
        x.faceValue - y.faceValue
      }
    }
  }
}

class ViewBoundDemo[T <% Ordered[T]] {
  def select(first: T, sencond: T): T = {
    if (first > sencond) first else sencond
  }
}

object ViewBoundDemo {
  def main(args: Array[String]): Unit = {
    import MyPredef.selectGril
    val vb = new ViewBoundDemo[Girl]
    val g1 = new Girl("小雅", 21, 100)
    val g2 = new Girl("小蓝", 18, 90)
    val s = vb.select(g1, g2)
    println(s.name)
  }
}
