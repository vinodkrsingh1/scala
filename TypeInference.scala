object TypeInference extends App{
  val aNum = 5
  val bNum: Int = 5
  val aStr = " Welcomme"
  val joinStr = aNum+aStr
  println(joinStr)

  //val aStrNum:String = aNum
  val aStrNum:String = aNum.toString

  def aFunction(a: Int, b:String) = a + b
  print(aFunction(aNum,aStr))


  def factorial(n: Int):Int =
    if (n <= 0) 1
    else n * factorial(n-1)

  println(factorial(5))

}
