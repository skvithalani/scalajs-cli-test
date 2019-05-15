import scala.scalajs.js

object TryLib extends js.Object {
  var lib = require('scalajs-cli-test3');
  val dd = new HelloWorldLib().square(2)
  println(dd)
}