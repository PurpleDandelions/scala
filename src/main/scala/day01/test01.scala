package day01

import scala.collection.mutable


class sest01 {

}

//静态类 相当于Java main 方法
object Test0{
  def main(args: Array[String]): Unit = {

    //函数当参数传入到方法中
   def f(a: Int,b: Int) : Int = {a+b}
    def aa(f: (Int,Int) => Int) = f(2,3)
    val f1 = (a: Int,b: Int) => a+b
    print(aa(f1))










  }
}