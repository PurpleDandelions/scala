package day02

object 练习题 {
  def main(args: Array[String]): Unit = {

    //創建一個list
    val list0 = List(2, 4, 3, 1, 6, 5, 7, 9, 8, 0)
    //將list0 中每一個元素乘以 2 形成一個新的list
    val list1 = list0.map(_ * 2)
    //將list0 中偶數取出來生成一個新的 list
    val list2 = list0.filter(_ % 2 == 0)
    //將 list0 排序后生成一個新的 list
    val list3 = list0.sorted
    //反轉排序順序
    val reverse = list3.reverse
    //將list0 元素中4個一組，類型為Iterator[List[Int]]
    val list4 = list0.grouped(4)
    //將Iterator 轉換成list
    val list5 = list4.toList
    //將多个list 压平成一个list
    val list6 = list5.flatten
    //先按空格切分，在压平
    val l1 = List(" hello c+ hellp python java hello", "hello scala hello c+")
    val fl = l1.map(_.split(" "))
    val flatten = fl.flatten

    val list7 = l1.flatMap(_.split(" "))
    //并行计算求和 par : 并行 和线程有关
    //((1+2)+3)
    val list8 = list0.par.sum
    val list9 = list0.par.reduce(_ + _)
    val list10 = list0.par.reduceLeft(_ + _)

    // val list9 = list0.reduce(_+_)
    // val list10 = list0.reduceLeft(_+_)

    //折叠，有初始值（无特定顺序）
    //fold 有两个（），第一个（）：需要操作时额外增加的数
    //第二个（）：操作的方法
    val list11 = list0.par.fold(0)(_ + _)
    //折叠，有初始值（有特定顺序）
    val list12 = list0.foldLeft(0)(_ + _)
    //聚合
    val aa = List(List(1, 2, 3), List(4, 5, 6))
    val aaa = aa.flatten.reduce(_ + _)
    val aaaa = aa.flatten.fold(0)(_ + _)
    // (0):初始值
    /**
      * _+_.sum : 第一个 _ 初始值 第二个 _ 需要聚合的每一个小的list元素  sum 两者求和
      * 每一个小的list 和 0 聚合
      * 局部聚合过程
      */
    // _+_  全局聚合函数
    val agr = aa.aggregate(0)(_ + _.sum, _ + _)


    val ll = List(1, 2, 3, 4)
    val l2 = List(4, 5, 6)
    //求并集
    val lll = ll union l2
    //求交集
    val jiao = ll intersect l2
    //求差集

    val cha = ll diff l2
    println(cha)


  }
}
