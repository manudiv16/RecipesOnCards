package controllers
import controllers.DatabaseDomain.RunSeq
import javax.inject._
import models.{Find, Recipe, findByName}
import play.api.mvc._

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration



@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index(): Action[AnyContent] = Action.async { implicit request: Request[AnyContent] =>
    val find: Find = Find()
    val x = for (l <- RunSeq(Option(find))) yield l
    Await.result(x,Duration(10,"seconds"))
    x map {a:Seq[Recipe] => Ok(views.html.index(a.map{car:Recipe => car.toCard}))}
//    Ok(views.html.index(x.map(a=>s"$a")))
  }

  //  def form(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
  //    Ok(vi)
  //
  //  }


}
