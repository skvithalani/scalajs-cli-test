import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("HelloWorldLib")
object HelloWorldLib {
  @JSExport
  def square(value: Int): Int = value * value
}
