package day02

object WorkCount {
  def main(args: Array[String]): Unit = {
    val l1 = List("hello c+ hellp python java hello", "hello scala hello c+")
    //先扁平化
    val fla = l1.flatMap(_.split(" "))
    //转换成映射
    val tup = fla.map((_, 1))
    //根据元祖第一个元素分组
    val grou = tup.groupBy(_._1)
    //统计数量
    val su = grou.mapValues(_.size)
    //排序
    val sor = su.toList.sortBy(_._2)
    //反转
    val rev = sor.reverse
    println(rev)
  }
}
