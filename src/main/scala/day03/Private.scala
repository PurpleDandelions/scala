package day03

/**
  * 类名前加private[包名] 是指包访问权限，只有day03 这个包有访问权限
  * 构造器参数列表前加private 是指半生对象的权限，只有伴生对象才能访问
  */
private[day03] class Private private(var id: Int) {
  //私有字段，字段前加private ，此时该字段称为私有字段
  private val name: String = "wei"
  //对象私有字段，表示在只能在本类访问
  private[this] var local: String = _

  //私有方法
  private def say(): Unit = {
    println(s"local $local")
  }
}
