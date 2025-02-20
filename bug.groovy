def myMethod() {
  def list = [1, 2, 3]
  list.each { element ->
    if (element == 2) {
      return // This will exit the method, not just the loop
    }
    println element
  }
}

myMethod()