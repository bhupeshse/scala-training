object FirstClass {
  def and(x : Boolean, y : => Boolean): Boolean =  {
    if(x) y
    else false
  }

  and(false,true)
  and(true, true)

  def loop:Boolean = {
    print("inside loop")
    true
  }

  and(false, loop)

  and(true, false)

}
