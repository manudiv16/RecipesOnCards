// @GENERATOR:play-routes-compiler
// @SOURCE:/home/manu/IdeaProjects/RecipesOnCards/conf/routes
// @DATE:Wed Sep 23 02:08:39 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
