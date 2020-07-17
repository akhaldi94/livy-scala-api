package com.livy.api

class LivyClientBuilder(var url: String = "http://localhost", var port: Long = 8998) {

  def setUri(url: String): Unit = this.url = url
  def setPort(port: Long): Unit = this.port = port

  def build(): LivyClient = {
    new LivyClient(url + ":" + port)
  }

}
