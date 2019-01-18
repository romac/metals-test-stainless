
lazy val root = (project in file("."))
  .enablePlugins(StainlessPlugin)
  .settings(
    name := "metals-test-stainless",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := "2.11.8"
  )

