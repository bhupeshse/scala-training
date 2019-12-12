object exercise3 {
  val romanNumber = Map("I"->1, "V" -> 5)
  val capitalOfCountries = Map("US" -> "Washington")
  def showCapital(country:String) = capitalOfCountries.get(country) match  {
    case Some(capital) => capital
    case None => "Not found"
  }

  showCapital("India")
  showCapital("US")

  val cap1 = capitalOfCountries withDefaultValue("Unknown")
  cap1("India")

  val fruits = List("Apple", "Mango","Orange", "MashMellow")
  fruits sortWith(_.length < _.length)
  fruits sorted

  fruits groupBy(_.head)
}