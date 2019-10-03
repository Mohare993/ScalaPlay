package controllers

import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def testpage = Action {
    Ok(views.html.testpage("Your new application is ready.")).withCookies(
      Cookie("EAT_ME", "Om_Nom_Nom"))
  }

  def hello(name: String) = Action {
    Ok(views.html.hello(name))

  }
}
