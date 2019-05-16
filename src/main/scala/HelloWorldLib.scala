import scala.scalajs.js.annotation.JSExport

class HelloWorldLib {
  @JSExport
  def square(value: Int): Int = value * value
}
