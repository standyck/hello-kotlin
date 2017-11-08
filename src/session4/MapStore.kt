class MUser(val map: Map<String, Any>) {
   val name: String by map
   val age: Int     by map
}

fun main(args: Array<String>) {
   val user = MUser(mapOf(
         "name" to "Johnny Foo",
         "age"  to 25
   ))

   println(user.name)
   println(user.age)
}
