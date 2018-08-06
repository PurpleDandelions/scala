package day03

/***
  *
  *  apply 通常称为注入方法，在半生对象里做一些初始化的操作
  *  apply 方法的参数列表不需要和构造器的参数列表统一
  *   unapply 方法通常称为提取方法，提取国定数量的对象
  *   unapply 方法会返回一个序列（Option），内部生产了一个Some对象来存储一些值
  *   apply 方法 和 unapply 方法 会被隐世的调用
  */
class ApplyDemo(var id:Int,var name:String) {

}
object ApplyDemo{
  //初始化操作
  def apply(id:Int,name:String): ApplyDemo = {
    new ApplyDemo(id,name)
  }
//提取
  def unapply(applyDemo: ApplyDemo): Option[(Int, String)] =
  {
    if(applyDemo == null){
      None
    }else{
      Some(applyDemo.id,applyDemo.name)
    }
  }
}
object test{
  def main(args: Array[String]): Unit = {
    val applyDemo = ApplyDemo(12,"wei")//调用apply 方法
    applyDemo match {
      case ApplyDemo(112,name) => println(s"name:$name")
      case _ => println("No math nothing")
    }
  }
}
