import io.eezo.db.{Schema, TableSpec}
import models.Book

object AppSchema extends Schema {
  // $ eezo routes
  // 9 routes:
  //  GET /hello
  //  GET /
  //  GET /books
  //  GET /books/new
  //  GET /books/:id
  //  GET /books/:id/edit
  //  POST /books
  //  PUT /books/:id
  //  DELETE /books/:id
  val books: TableSpec[Book] = table[Book].unique(_.title)
}
