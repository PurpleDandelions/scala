package day04

class 高阶函数 {
  //
}

object 高阶函数 {
  def main(args: Array[String]): Unit = {
    //定义一个函数
    val func: Int => Int = x => x * x
    println(func(4))
    //第一种写法
    val arr = Array(1, 2, 3)
    val a = arr.map(x => func(x))
    println(a.toBuffer)
    //第二种写法
    val aa = arr.map(func)
    println(aa.toBuffer)

    //方法隐世转换成函数
    def m1(x: Int) = x * x

    //第一种写法
    val b = arr.map(x => m1(x))
    println(b.toBuffer)
    //第二种写法
    val c = arr.map(m1)
    println(c.toBuffer)


  }

}