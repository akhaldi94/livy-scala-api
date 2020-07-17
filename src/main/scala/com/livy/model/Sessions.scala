package com.livy.model

object Sessions{
}
case class Sessions(id: Int, appId: String, owner: String = "", proxyUser: String = "", kind: SessionKind, log: List[String], state: String, appInfo: ) {

}
