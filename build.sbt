resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSPlugin)
name := "Scala.js CLI Demo first release"
scalaVersion := "2.12.7"
scalaJSModuleKind := ModuleKind.CommonJSModule
scalaJSUseMainModuleInitializer := true
mainClass in Compile := Some("HelloWorldApp")

// https://mvnrepository.com/artifact/io.scalajs/nodejs
libraryDependencies += "io.scalajs" %%% "nodejs" % "0.4.2"

moduleName in fullOptJS := "scalajs-cli-demo"
