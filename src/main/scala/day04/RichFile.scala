package day04

import scala.io.Source

class RichFile(val file: String) {
  def read: String = {
    Source.fromFile(file).mkString
  }
}

object MyPredef {
  implicit def fileToRichFile(file: String) = new RichFile(file)
}

object RichFile {
  def main(args: Array[String]): Unit = {
    //显示转换
    val re = new RichFile("F:/a.txt").read
    //  println(re)
    //隐式转换
    import MyPredef.fileToRichFile
    val file = "F:/a.txt"
    val comtent = file.read
    println(comtent)
  }
}
