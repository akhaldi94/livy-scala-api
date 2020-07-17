package com.livy.api

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpecLike
class LivyClientTest extends AnyWordSpecLike with Matchers  {

  "livy" should {
    "get sessions" in {
      val livyClient = new LivyClientBuilder().build()
      livyClient.getSessions()
    }
  }
}
