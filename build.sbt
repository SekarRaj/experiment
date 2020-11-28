val dottyVersion = "3.0.0-M2"

enablePlugins(GraalVMNativeImagePlugin)
graalVMNativeImageOptions ++= Seq(
      "--initialize-at-build-time",
    )

lazy val root = project
  .in(file("."))
  .settings(
    name := "experiment",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
