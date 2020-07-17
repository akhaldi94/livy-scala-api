package com.livy.model

object Session{
}
case class Session(id: Int, appId: String, owner: String = "", proxyUser: String = "", kind: SessionKind, log: List[String], state: String, appInfo: String)
