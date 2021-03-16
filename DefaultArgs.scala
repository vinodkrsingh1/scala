object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10, 2)

  def functionExample(a:Int = 0, b:Int = 0):Int = { // default values as 0
    a+b
  }

  var result1 = functionExample(15,2) // Calling with two values
  var result2 = functionExample(15) // Calling with one value
  var result3 = functionExample() // Calling without any value
  println(result1+"\n"+result2+"\n"+result3)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)

  /*
    1. pass in every leading argument
    2. name the arguments
   */
  
  savePicture(height = 600, width = 800, format = "bmp")

  def diff(a:Int,b:Int):Int={
    return b-a
  }
   println(diff(2,3))
   println(diff(b=3,a=2))

}
