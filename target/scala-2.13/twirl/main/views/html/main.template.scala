
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/stylesheets/main.css">
    <link rel="stylesheet" media="screen" type="text/css" href='"""),_display_(/*16.66*/routes/*16.72*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.113*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/prism.css")),format.raw/*17.98*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("images/favicon.png")),format.raw/*18.100*/("""'>
    <script src='"""),_display_(/*19.19*/routes/*19.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*19.66*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*20.66*/("""' type="text/javascript"></script>
</head>

<body>
    """),_display_(/*24.6*/parts/*24.11*/.header()),format.raw/*24.20*/("""

    """),_display_(/*26.6*/content),format.raw/*26.13*/("""
"""),format.raw/*27.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-23T02:37:10.466680
                  SOURCE: /home/manu/IdeaProjects/RecipesOnCards/app/views/main.scala.html
                  HASH: a0896da2f32645a97f7c26d3b84009177654f09d
                  MATRIX: 992->266|1117->296|1147->300|1231->357|1257->362|1499->577|1514->583|1577->624|1657->677|1672->683|1735->725|1820->783|1835->789|1896->828|1945->850|1960->856|2022->897|2103->951|2118->957|2180->998|2266->1058|2280->1063|2310->1072|2345->1081|2373->1088|2402->1090
                  LINES: 26->7|31->7|33->9|37->13|37->13|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|48->24|48->24|48->24|50->26|50->26|51->27
                  -- GENERATED --
              */
          