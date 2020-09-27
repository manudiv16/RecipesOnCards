package controllers

import java.util.logging.{Level, Logger}
import models._
import org.bson.codecs.configuration.CodecRegistries.{fromProviders, fromRegistries}
import org.bson.codecs.configuration.CodecRegistry
import org.mongodb.scala.bson.codecs.Macros._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.{MongoClient, MongoCollection, MongoDatabase}
import scala.concurrent.Future


object DatabaseDomain {
  val mongoLogger: Logger = Logger.getLogger("org.mongodb.driver")
  mongoLogger.setLevel(Level.SEVERE)
  val registries: CodecRegistry = fromRegistries(fromProviders(classOf[Recipe]), MongoClient.DEFAULT_CODEC_REGISTRY)
  val mongoClient: MongoClient = MongoClient("mongodb://192.168.0.175:8787")
  val database: MongoDatabase = mongoClient.getDatabase("mydatabase") withCodecRegistry registries
  val collection: MongoCollection[Recipe] = database.getCollection("Recipes")

  def Run(petition: Option[Database]): Future[_] = petition match {
    case Some(a) => run(a)
    case None => Future.failed(new Throwable("Any parameters"))

  }

  def RunSeq(petition: Option[Database]): Future[Seq[Recipe]] = petition match {
    case Some(_) => collection.find().toFuture(): Future[Seq[Recipe]]
    case None => Future.failed(new Throwable("Any parameters"))
  }

  def run(petition: Database): Future[_] = petition match {
    case save(film: Recipe) => collection.insertOne(film).head
    case findByName(name: String) => collection.find(equal("title", name)).head()
    case Find() => collection.find().toFuture(): Future[Seq[Recipe]]
    case _ => Future.failed(new Throwable("hola"))

  }

}