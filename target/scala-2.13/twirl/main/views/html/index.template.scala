
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import controllers._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[card],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(cards: List[card]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""

"""),_display_(/*4.2*/main("Welcome")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
"""),format.raw/*5.1*/("""<section class="card-list">
    """),_display_(/*6.6*/for( card <- cards) yield /*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<article class="card">
        <header class="card-header">
            <p>"""),_display_(/*9.17*/card/*9.21*/.date),format.raw/*9.26*/("""</p>
            <h2>"""),_display_(/*10.18*/card/*10.22*/.title),format.raw/*10.28*/("""</h2>
        </header>
        <div class="image">
            <img src=""""),_display_(/*13.24*/card/*13.28*/.img),format.raw/*13.32*/("""" alt="" srcset="">
        </div>
        <div class="card-author">
            <a class="author-avatar" href="#">
                <img src=""""),_display_(/*17.28*/card/*17.32*/.authorImg),format.raw/*17.42*/(""""/>
            </a>
            <svg class="half-circle" viewBox="0 0 106 57">
                <path d="M102 4c0 27.1-21.9 49-49 49S4 31.1 4 4"></path>
            </svg>

            <div class="author-name">
                <div class="author-name-prefix">"""),_display_(/*24.50*/card/*24.54*/.authorUser),format.raw/*24.65*/("""</div>
                """),_display_(/*25.18*/card/*25.22*/.authorName),format.raw/*25.33*/("""
            """),format.raw/*26.13*/("""</div>
        </div>
        <div class="tags">
            """),_display_(/*29.14*/for(tag <- card.tags) yield /*29.35*/{_display_(Seq[Any](format.raw/*29.36*/("""
            """),format.raw/*30.13*/("""<a href="#">"""),_display_(/*30.26*/tag),format.raw/*30.29*/("""</a>
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</div>
    </article>
    """)))}),format.raw/*34.6*/("""
"""),format.raw/*35.1*/("""</section>
""")))}))
      }
    }
  }

  def render(cards:List[card]): play.twirl.api.HtmlFormat.Appendable = apply(cards)

  def f:((List[card]) => play.twirl.api.HtmlFormat.Appendable) = (cards) => apply(cards)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-25T17:03:07.132293
                  SOURCE: /home/manu/IdeaProjects/RecipesOnCards/app/views/index.scala.html
                  HASH: 2a1b33212125149bf52b36f6ccb8c5c44efda407
                  MATRIX: 432->1|761->24|875->43|905->48|928->63|967->65|995->67|1054->101|1088->120|1127->122|1159->128|1263->206|1275->210|1300->215|1350->238|1363->242|1390->248|1495->326|1508->330|1533->334|1707->481|1720->485|1751->495|2045->762|2058->766|2090->777|2142->802|2155->806|2187->817|2229->831|2321->896|2358->917|2397->918|2439->932|2479->945|2503->948|2553->967|2590->977|2649->1006|2678->1008
                  LINES: 17->1|22->2|27->2|29->4|29->4|29->4|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|38->13|38->13|38->13|42->17|42->17|42->17|49->24|49->24|49->24|50->25|50->25|50->25|51->26|54->29|54->29|54->29|55->30|55->30|55->30|56->31|57->32|59->34|60->35
                  -- GENERATED --
              */
          