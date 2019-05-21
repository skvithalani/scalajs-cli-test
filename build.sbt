import org.scalajs.core.tools.linker.backend.ModuleKind.CommonJSModule

resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSBundlerPlugin)

organization := "com.thoughtworks.scalajs"
name := "scalajs-cli-test2"
version := "1.0.0"
scalaVersion := "2.12.8"
scalaJSModuleKind := CommonJSModule
scalaJSUseMainModuleInitializer := true
mainClass in Compile := Some("HelloWorldApp")

// https://mvnrepository.com/artifact/io.scalajs/nodejs
libraryDependencies += "io.scalajs" %%% "nodejs" % "0.4.2"

val license = "Apache 2.0"

val repoUrl = "git+https://github.com/skvithalani/scalajs-cli-test.git"

val desc = "Awesome ScalaJS project by no one..."

import scalajsbundler.util.JSON._

additionalNpmConfig in Compile := Map(
  "name" -> str(name.value),
  "version" -> str(version.value),
  "description" -> str(desc),
  "license" -> str(license),
  "repository" -> str(repoUrl),
  "files" -> arr(str("index.js"), str("index.d.ts")),
  "main" -> str((Compile / fullOptJS / artifactPath).value.getCanonicalPath)
)