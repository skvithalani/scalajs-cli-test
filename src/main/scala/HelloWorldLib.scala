import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("HelloWorldLib")
class HelloWorldLib {
  @JSExport
  def square(value: Int): Int = value * value
}
