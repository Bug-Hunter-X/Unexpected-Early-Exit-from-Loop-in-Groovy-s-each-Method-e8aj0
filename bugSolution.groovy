def myMethod() {
  def list = [1, 2, 3]
  boolean found = false
  list.eachWithIndex { element, index ->
    if (element == 2) {
      found = true
      return // Exits only the closure, not myMethod
    }
    println element
  }
  if(!found) println "Element not found"
}

myMethod() 