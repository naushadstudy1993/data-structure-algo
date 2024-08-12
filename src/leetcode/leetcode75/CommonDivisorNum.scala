package leetcode.leetcode75

object CommonDivisorNum {
  def main(args: Array[String]): Unit = {
    var a = 40;
    var b = 55;
    
    while(b != 0){
      println(s"a=$a, b= $b")
      var temp = b;
      b = a % b;
      a = temp;
      println(s"a=$a, b= $b")
      println("==============")
    }
  }
  //Feature_1
}