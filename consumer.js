// import * as ddd from "scalajs-cli-test2"
var ddd = require("index")

console.log("**********************")
console.log(ddd.HelloWorldLib.square(2))
console.log(ddd.dd)
console.log(ddd.HelloWorldLib)
console.log("**********************")

exports.piny = function piny(string) {
    if (typeof string !== "string") throw new TypeError("Tiny wants a string!");
    return string.replace(/\s/g, "");
};