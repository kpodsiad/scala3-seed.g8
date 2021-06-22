// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.

enablePlugins(ScriptedPlugin)

name := "scala3-seed"

addCommandAlias("test", "g8test")

scriptedLaunchOpts ++= Seq(
  "-Xms1024m",
  "-Xmx1024m",
  "-XX:ReservedCodeCacheSize=128m",
  "-Xss2m",
  "-Dfile.encoding=UTF-8"
)
