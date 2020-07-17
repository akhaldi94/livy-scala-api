package com.livy.api

import com.livy.model.Sessions

class LivyClient(val url: String) {

  def getSessions() : List[Sessions]
}
