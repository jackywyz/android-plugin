name := "sbt-android-plugin"

organization := "org.scala-sbt"

version := "0.6.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xcheckinit", "-Xfatal-warnings")

publishMavenStyle := true



credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

libraryDependencies ++= Seq(
  "com.google.android.tools" % "ddmlib" % "r10",
  "net.sf.proguard" % "proguard-base" % "4.8"
)

sbtPlugin := true

commands += Status.stampVersion
