package day03

import scala.collection.mutable.ArrayBuffer

/**
  * 在 scala 中是没有静态方法静态字段的
  * 可以使用 object 关键字加类名的语法结构实现同样的功能
  *  1.工具类，存放常量和工具方法
  *  2.实现单例模式
  *
  */
object 单例对象 {
  def main(args: Array[String]): Unit = {
    val sf = SessionFactory
    println(sf.getSession)
    println(sf.getSession.size)
    println(sf.getSession(0))
    println(sf.delSession)
  }
}

object SessionFactory {
  /** *
    *
    * 相当于静态代码块
    */
  println("SessionFactory 执行了")
  var i = 5
  private val sess = new ArrayBuffer[Session]()

  while (i > 0) {
    sess += new Session
    i -= 1
  }

  def getSession = sess

  def delSession: Unit = {
    val s = sess(0)
    sess.remove(0)
    println("session 移除" + s)
  }
}

class Session {}
