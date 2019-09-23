object Main extends App {

  // Functions
  val addOne = (x: Int) => x + 1

  val multiplyStringFunction = (text: String, multiplier: Int) => {
    text * multiplier
  }

  val printArrayMembers = (array: Array[String]) => {
    for (arrayElement <- array) {
      println(arrayElement)
    }
  }

  // Methods
  def multiplyStringMethod(text: String, multiplier: Int): String = {
    text * multiplier
  }

  // No parameter method
  def getAlex = {
    "Alex"
  }

  // Classes
  class Alex(mood: String) {
    def greet(): String = {
      var greeting = ""
      if (mood == "happy") {
        greeting = "Hello! How's it going?"
      } else if (mood == "grumpy") {
        greeting = "Hey, what's up?"
      }
      greeting
    }
  }

  //Objects
  object team {
    val scrumMaster: String = "Jamie"
    val productOwner: String = "Kelly"
    val developers = Array("Ant", "Luke", "Nick", "RJ", "Maddie", "Alex")
  }

  object titan {
    val currentProject: String = "Crime Rating"
    val teamMembers = team
  }



  println("\n\n\n")

  // val's can only be assigned once
  // can optionally specify type
  val x: Int = 1 + 1
  val y = 2 + 2

  // var's can be re-assigned
  var z = y - x
  z *= z

  // println(multiplyStringFunction("cool ", z))
  // println(multiplyStringMethod("cool ", z))
  // val alex = new Alex("grumpy")
  // println(alex.greet())
  // val firstDeveloper = titan.developers(0)
  // printArrayMembers(titan.developers)
  // println(getAlex)
  println(titan.teamMembers.developers.mkString("\n"))


  println("\n\n\n")
}