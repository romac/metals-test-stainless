resolvers += Resolver.url(
  "LARA sbt plugins releases",
  url("https://dl.bintray.com/epfl-lara/sbt-plugins/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("ch.epfl.lara" % "sbt-stainless" % "0.1.0-26fe8205946ce2f2c052721265744d7dfca9c15f")

