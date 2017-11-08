import kotlin.properties.Delegates
class DUser {
   var name: String by Delegates.observable("<no name>") {
      prop, old, new ->
      println("I'll be changing $old to $new")
   }
}

fun main(args: Array<String>) {
   val user = DUser()
   user.name = "first"
   user.name = "second"
}
