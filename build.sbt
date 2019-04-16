ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "yuchen.spike"

lazy val sangriaSpike = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "SangriaSpike",
    libraryDependencies += "org.sangria-graphql" %% "sangria-circe" % "1.2.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
