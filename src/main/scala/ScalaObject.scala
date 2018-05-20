class ScalaObject {
  def sayHello() = {
    println("Hi from Scala!")
  }
}

object ScalaObject {
  def main(args: Array[String]) {
    val scalaObject = new ScalaObject()
    scalaObject.sayHello()
  }
}
