// import * as ddd from "scalajs-cli-test2"
var ddd = require("./target/scala-2.12/scalajs-bundler/main/scalajs-cli-test4-fastopt-bundle")

console.log("**********************")
console.log(ddd)
console.log("**********************")

exports.piny = function piny(string) {
    if (typeof string !== "string") throw new TypeError("Tiny wants a string!");
    return string.replace(/\s/g, "");
};