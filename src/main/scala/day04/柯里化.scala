package day04

object 柯里化 {
  //多个参数名
  //柯里化方法
  //方法1（声明）
  def curry(a:Int)(b:Int) = a*b
  def curry_1(a:Int) =(b:Int) => a*b//等价于上一个声明方法
  //转换（需要有一个固定的值）
  val curry1 = curry(3) _
  //方法2(隐世设置一个值)
  def m1(a:Int,b:Int) = a*b
  //隐示的值可以替换
  def m2(a:Int)(implicit b:Int = 5) = a*b
  //方法3(隐世设置一个值)
  //改设置只能有一个否则会报错，跟变量名没关系只跟数据类型有关
  //会从上下文中去找，会替换掉方法2中 implicit 修饰的字段设置的默认值
  implicit val y = 100


  def main(args: Array[String]): Unit = {
    println(curry(2)(3))
    println(curry1(6))
    println(m1(6,5))
    println(m2(6))
    println(m2(6)(6))
    println(m2(6))


  }
}
