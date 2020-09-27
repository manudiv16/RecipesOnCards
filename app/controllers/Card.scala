package controllers

import java.text.SimpleDateFormat
import java.util.Calendar

object Card {
  private val format = new SimpleDateFormat("dd/MM/yyyy")

  private def date(): String = format.format(Calendar.getInstance().getTime)

  def apply(title: String, img: String,
            authorImg: String,authorUser: String,
            authorName: String, tags: Seq[String]):
  Card = new Card(date(), title, img, authorImg, authorUser, authorName, tags)
}

case class Card(date: String, title: String,
                img: String, authorImg: String,
                authorUser: String, authorName: String,
                tags: Seq[String])