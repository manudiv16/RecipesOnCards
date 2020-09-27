package models

sealed trait Database

case class save[U](u: U) extends Database

case class findByName(name: String) extends Database

case class Find() extends Database



