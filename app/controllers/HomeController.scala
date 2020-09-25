package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val recipeOne:card = card(title = "Pudim de chocolate facil",
      tags = Seq("vegan","chocolate","pudim","fast"),
      img = "https://cmx.vigilantesdopeso.com.br/assets-proxy/weight-watchers/image/upload/t_WINE_EXTRALARGE/shrsjatzpvhqizexv4fp.jpg",
      authorImg = "https://avatars1.githubusercontent.com/u/38869988?s=460&v=4",
      authorName = "Manu",
      authorUser = "manudiv15"
    )
    Ok(views.html.index(List(recipeOne
      ,recipeOne,
      recipeOne,recipeOne,
      recipeOne,recipeOne,
      recipeOne)))
  }

  //  def form(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
  //    Ok(vi)
  //
  //  }


}
