import typings.nodeLib.^

object HelloWorldApp {
  def main(): Unit = {
    println("Hello world from Scala.js! dd")
    println("----")
    println("To demonstrate usage of Node.js api, here's some of your environment:")

    ^.process.env.take(5).foreach {
      case (key, value) =>
        println(s"$key = $value")
    }
  }
}
