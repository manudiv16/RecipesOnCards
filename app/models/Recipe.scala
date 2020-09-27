package models

import controllers.Card
import org.mongodb.scala.bson.ObjectId

case class Recipe(_id: ObjectId,attributes: Map[String, String], img: String, ingredients: Map[String, String],
                  instructions: Seq[String], title: String, observations: Option[String]){
  def toCard:Card = Card(title,img,authorImg="hah",authorUser = "manu",authorName = "manu",tags = Seq("hola","que tal"))

}

object Recipe{
  def apply(attributes: Map[String, String], img: String, ingredients: Map[String, String], instruction: Seq[String], title: String, observations: Option[String]): Recipe =
    new Recipe(new ObjectId,attributes, img, ingredients, instruction, title, observations)
}

