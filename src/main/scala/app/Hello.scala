package app

import io.eezo.core.html.*
import io.eezo.http.{Request, Response}

object Hello {
  
  def hello(request: Request): Response = {
    val name = request.queryParam("name").getOrElse("stranger")
    Response.Ok(
      Html.doctype ++ html(
        head(meta(Attrs.charset := "utf-8"), title("Hello")),
        body(
          h1(s"Hello, $name!"),
          p("This page is served by eezo. Try ", a(Attrs.href := "/hello?name=you", "?name=you"), ".")
        )
      )
    )
  }

}
