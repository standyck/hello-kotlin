val lazyValue: String by lazy {
   println("computing...")
   "Hello"
}

fun main(args: Array<String>) {
   println(lazyValue)
   println(lazyValue)
}

//prints out the "computing..." the first time only.
