package com.livy.json
import com.livy.model.Session
import play.api.libs.json._

case class GetSessionsJson(from: Int, total: Int, sessions: List[Session])
object GetSessionsJson {
  implicit val getSessionsJsonFormats: OFormat[GetSessionsJson] = Json.format[GetSessionsJson]
  def writeAddress(getSessionsJsonFormats: GetSessionsJson): JsValue = {
    Json.toJson(getSessionsJsonFormats)
  }
  def readAddress(jsonGetSessionsJson: JsValue): GetSessionsJson = {
    jsonGetSessionsJson.as[GetSessionsJson]
  }

}