package day03


/**
  * 声明类时不需要加 public
  * 默认的类就是 public
  * 一个类文件可以声明多个类
  * object 声明的为静态类
  * object 修饰的类为静态类
  * object 类名 和 class 类名相同 object 类为class 类的伴生对象
  *
  */
class 面向对象 {
  //val 修饰的变量是只读的，相当于只有get 方法，没有set 方法
  val name: String = "小明"
  //var 修饰的变量既有get 也有set 方法
  // _ 相当于默认值，默认值由类型确定，类型是什么默认值就是该类型的默认值
  var id: Int = _
  //用private 修饰的属性，该属性属于类私有变量,只能在本类和伴生类中才能访问
  private val age: Int = 23
  //用private[this] 修饰的属性，该属性属于对象的私有变量，只能在本类中访问
  private[this] var local: String = _

}

/**
  * 主构造器(相当于Java构造函数)
  * 主构造器的参数列表要放到类名的后面，和类名放在一起
  * val 修饰的构造器参数具有不可变性，没有set 方法
  * var 修饰的构造器参数具有可变形，有set 方法
  * 声明构造器时变量前没有 var或val 修饰必须在构造器里写上该字段对应的get方法才能调用，否则只能在本类调用，半生对象也无法调用，可以给该字段直接赋值
  * age 虽然没有用val 或 var 修饰 ，但是默认是val 修饰
  */
class 面向对象2(var id: Int, val name: String, age: Int = 18) {
  def getAge(): Int = {
    //值不可以更改默认是val 修饰
    this.age
  }

  var local: String = _
  var aa: Int = _
  var ss: Int = _
  //辅助构造器
  def this(id: Int, name: String, age: Int, local: String) {
    this(id, name, age) //辅助构造器必须第一行先调用主构造器
    this.local = local
  }
  def this(id: Int, name: String, age: Int, aa: Int) {
    this(id, name, age) //辅助构造器必须第一行先调用主构造器
    this.aa = aa
  }
  def this(id: Int, name: String, age: Int,ss:Int, aa: Int) {
    this(id, name, age) //辅助构造器必须第一行先调用主构造器
    this.aa = aa
    this.ss = ss
  }

}

object 面向对象 {
  def main(args: Array[String]): Unit = {
    val per = new 面向对象
    per.id = 1
    //   println(per.id)
    //   println(per.age)
    //  val oo = new 面向对象2(12, "12313")
    val oo = new 面向对象2(12, "123", 12, "qwewe")
    val q1 =new 面向对象2(12, "123", 1,23,23)
    val q2 =new 面向对象2(12, "123", 1,2)
   println(q2.aa)
    q1.ss
    oo.id = 22
   /* println(oo.getAge())
    println(oo.id)
    println(oo.name)*/
  }
}