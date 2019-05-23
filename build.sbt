resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSBundlerPlugin)
//enablePlugins(ScalaJSPlugin)

organization := "com.thoughtworks.scalajs"
name := "scalajs-cli-test4"
version := "3.0.2"
scalaVersion := "2.12.8"
//scalaJSModuleKind := CommonJSModule
scalaJSUseMainModuleInitializer := true
mainClass in Compile := Some("HelloWorldApp")

// https://mvnrepository.com/artifact/io.scalajs/nodejs
libraryDependencies += "io.scalajs" %%% "nodejs" % "0.4.2"

val resourceDir = new File("/Users/in-puneet.patwari/Documents/Workspace/TMT/scalajs-cli-test/src/main/resources")

Compile / jsSourceDirectories += resourceDir

val license = "Apache 2.0"

val repoUrl = "git+https://github.com/skvithalani/scalajs-cli-test.git"

val desc = "Awesome ScalaJS project by no one..."

import scalajsbundler.util.JSON._

additionalNpmConfig in Compile := {
  val path = (Compile / fullOptJS / artifactPath).value.name.stripSuffix(".js")+"-bundle.js"
  val typePath = path.stripSuffix("-bundle.js") + ".d.ts"
  Map(
    "name" -> str(name.value),
    "version" -> str(version.value),
    "description" -> str(desc),
    "README.md" → str(""),
    "keywords" → arr(str("")),
    "license" -> str(license),
    "repository" -> str(repoUrl),
    "files" -> arr(resourceDir.listFiles().map(x => str(x.name)): _*),
    "main" -> str(path),
    "types" → str(typePath),

  )
}