package com.livy.api

import com.livy.errors.LivyClientException
import com.livy.model.Session
import org.apache.http.client.methods.{CloseableHttpResponse, HttpGet}
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils

object LivyClient {

  def checkResponse(execution: CloseableHttpResponse): Unit = {
    if (execution.getStatusLine.getStatusCode != 200)
      throw new LivyClientException("Please check your livy server")
    if (execution.getStatusLine.getReasonPhrase.toUpperCase.trim != "OK")
      throw new LivyClientException("Please check your livy server")
  }

  def responseToList[A](execution: CloseableHttpResponse ) = {
    val entity = EntityUtils.toString(execution.getEntity)
  }
}
class LivyClient(val url: String) {
  val client =  HttpClients.createDefault

  def getSessions(): List[Session] = {
    val getSessionsUrl = url + "/sessions"
    val getSessionsRequest = new HttpGet(getSessionsUrl)
    val execution: CloseableHttpResponse = client.execute(getSessionsRequest)
    LivyClient.checkResponse(execution)
    LivyClient.responseToList[Session](execution)
    List()

  }
}
