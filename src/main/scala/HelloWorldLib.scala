import scala.scalajs.js
import js.annotation._

@ScalaJSDefined
@JSExport("HelloWorldLib")
class HelloWorldLib extends js.Object {
  def square(value: Int): Int = value * value
}
