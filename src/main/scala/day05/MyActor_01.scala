package day05
import scala.actors.Actor
object MyActor_01 extends Actor{
  override def act(): Unit = {
    for (i <- 1 to 10){
      println("Actor-1: "+i)
      Thread.sleep(1000)
    }
  }
}
object MyActor_02 extends Actor{
  override def act(): Unit = {
    for (i <- 1 to 10){
      println("Actor-2: "+ i)
      Thread.sleep(1000)
    }
  }
}
object ActorTest{
  def main(args: Array[String]): Unit = {
    //启动Actor
    MyActor_01.start()
    MyActor_02.start()
  }
}