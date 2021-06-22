ThisBuild / organization := "$package$"
ThisBuild / scalaVersion := "$scala_version$"

ThisBuild / scalacOptions ++=
  Seq(
    "-deprecation",
    "-feature",
    "-language:higherKinds",
    "-language:existentials",
    "-unchecked",
    "-Xfatal-warnings",
    "-Yexplicit-nulls", // experimental
    "-Ykind-projector:underscores",
  ) ++ Seq("-rewrite", "-indent") ++ Seq("-source", "future")

lazy val root = project
  .in(file("."))
  .settings(name := "scala3-seed")
  .settings(dependencies)

lazy val dependencies = Seq(
  libraryDependencies ++= Seq(
    // main dependencies
  ),
  libraryDependencies ++= Seq(
    "org.scalameta" %% "munit" % "0.7.26"
  ).map(_ % Test)
)
