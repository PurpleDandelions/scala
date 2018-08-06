package day05

import scala.actors.Actor

/**
  * 用Actor实现同步和异步的消息的发送和消息的接收
  */
class MyActor_03 extends Actor {
  override def act(): Unit = {
    while (true) {
      //偏函数
      receive {
        case "start" => println(("string......"))
        case AsynMag(id, msg) => {
          println((s"id: $id,Msg: $msg"))
          Thread.sleep(2000)
          // ！ ：相当于方法
          sender ! ReplyMag(5, "success")
        }
        case SyncMag(id, msg) => {
          println(s"id: $id,msg: $msg")
          Thread.sleep(2000)
          sender ! ReplyMag(5, "success")
        }
      }
    }
  }
}

object MyActor_03 {
  def main(args: Array[String]): Unit = {

    val ma: MyActor_03 = new MyActor_03
    ma.start()

    //异步发送消息没有返回值
    /*    ma ! AsynMag(1, "He~ ")
        println("没有返回值的异步消息发送成功")*/

    //同步发送消息，线程等待返回值
    /*     val sy: SyncMag = SyncMag(2, "He~小雅")
        ma !? sy
       println("返回消息： "+ sy)
        println("有返回值的同步消息发送完成")*/

    //异步发送消息，有返回值，返回类型是Future[Any]
    val reply = ma !! AsynMag(3, "He~ 小芳")
    Thread.sleep(3000)
    if (reply.isSet) {
      val value = reply.apply()
      println(value)
    } else {
      println("None")
    }
  }
}

//参数有个数限制 22个，多余22个写一个对象封装
case class AsynMag(val id: Int, val Msg: String)

case class SyncMag(val id: Int, val Msg: String)

case class ReplyMag(val id: Int, val Msg: String)