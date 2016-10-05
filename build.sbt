
name := "Scala Shapefile Parser"

scalaVersion := "2.11.8"

libraryDependencies += "com.vividsolutions" % "jts" % "1.13"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
