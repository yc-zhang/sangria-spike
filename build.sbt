ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "yuchen.spike"

lazy val sangriaSpike = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "SangriaSpike",
    libraryDependencies ++= devDependencies,
    libraryDependencies ++= testDependencies
  )

val devDependencies = Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.8",
  "com.typesafe.akka" %% "akka-stream" % "2.5.19",
  "org.sangria-graphql" %% "sangria" % "1.4.2",
  "org.sangria-graphql" %% "sangria-circe" % "1.2.1"
)

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)
