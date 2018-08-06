package day03

import scala.util.Random

class 模式匹配 {

}

object 模式匹配 {
  def main(args: Array[String]): Unit = {


    val arr = Array("java", "scala", "c+", "python")
    val obj = arr(Random.nextInt(arr.length))
    //匹配字符串
    obj match {
      case "java" => println("java")
      case "c+" => println("c+")
      case _ => println("无")
    }
    val arr1 = Array("java", "scala", "c+", "python", 123, true, 3.14)
    val obj1 = arr1(Random.nextInt(arr1.length))
    //匹配类型
    obj1 match {
      case str: String => println(s"is $arr")
      case _ => println("is not")
    }
    //匹配数组、元祖、集合
    val ar = Array(1, 2, 3)
    ar match {
      case Array(_, x, y, z) => println(s"is $x,$y,$z")
      case Array(1, x, y) => println(s"is $x,$y")
      case _ => println("is not")

    }
    val tup = (2, 3, 4)
    tup match {
      case (2, x, y) => println(s"is $x ,$y")
      case _ => println("is not")
    }
    val list1 = List(1, 2, 3, 4)
    //Nil 代表 空的 集合
    list1 match {
      case List(6, a, b, c) => println(s"is $a $b $c")
      case 0 :: Nil => println("case 1")
      //从右往左
      case a :: b :: c :: d :: Nil => println(s"is $a $b $c $d") // === case List(0,a,b,c) =>  println(s"is $a $b $c")
      case _ => println("is not")

    }
  }
}