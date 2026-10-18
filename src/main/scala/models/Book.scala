package models

import io.eezo.core.Id
import io.eezo.db.Table
import io.eezo.http.{Form, Resource}

case class Book(
               id: Id[Book],
               title: String,
               author: String,
               pages: Int,
               notes: Option[String]
               ) derives Table, Form, Resource
