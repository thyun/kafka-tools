import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.10.4",
//      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "kafka-tools",
    libraryDependencies += scalaTest % Test,
	mainClass in (Compile, run) := Some("example.Hello"),
	unmanagedBase := file("/Users/1001291/work/kafka_2.10-0.8.2.2/libs")
//	unmanagedBase := baseDirectory.value / ".." / ".." / "work" / "kafka_2.10-0.8.2.2" / "libs"
  )
