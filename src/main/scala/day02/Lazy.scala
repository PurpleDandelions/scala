package day02

/**
  *
  * scala 中使用lazy 定义的变量叫做惰性变量，会实现延迟加载
  * 惰性变量只能是不可变变量，只有在调用惰性变量的时候才去实例化这个变量
  *
  */
class LazyDemo {

}

/*object LazyDemo {
  def init(): Unit = {
    println("call Lazy{}")
  }

  def main(args: Array[String]): Unit = {
    val la = init() //没有用lazy 修饰
    println("after init{}")
    println(la)
  }
}*/
  object LazyDemo{
    def init(): Unit = {
      println("call Lazy{}")
    }

    def main(args: Array[String]): Unit = {
     lazy val la = init()//没有用lazy 修饰
      println("after init{}")
      println(la)
    }
}
