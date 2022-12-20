import com.utsman.binar.something

fun main(args: Array<String>) {

//    something(age = 12)
//
//    var age: Int? = null
//
//    age = 1

    all("anuan", "iya", "oke", age = 10)

    something()

}

//fun something(name: String = "utsman", age: Int) {
//    println("nama: $name | umur: $age")
//}

val arrayString: Array<String> = arrayOf()
val arrays: Array<Array<String>> = arrayOf()

fun all(vararg name: String, age: Int) {

    println(name.toList())
}