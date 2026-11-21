lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "project_pf",
    scalaVersion := "3.8.4",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies +=
      "org.scala-js" %%% "scalajs-dom" % "2.8.1"
  )