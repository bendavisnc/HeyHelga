
scalaVersion := "2.12.1"

name := "HeyHelga - Guice version"

organization := "gmail.bendavisnc"

version := "0.0.3"

libraryDependencies += "gmail.bendavisnc" %% "heyhelgacommon" % "0.1.8"

libraryDependencies += "com.google.inject" % "guice" % "4.1.0"

libraryDependencies += "com.lihaoyi" %% "utest" % "0.4.7" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

