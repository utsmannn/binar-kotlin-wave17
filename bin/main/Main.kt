fun main(args: Array<String>) {

//    println("input your username")
//    val username = readLine()
//    println("welcome $username")
//
//    println("input you age")
//    val ageInput = readLine()
//    val age: Int? = ageInput?.toIntOrNull()
//    println("your age is $age")

//    var username: String? = "utsman"
//
//    println("username : $username")
//    username = null
//    println("username : $username")
//
//    var password: String? = "1234"
//    password = null
//
//    val panjangPassword = password?.length

    val isValid = true

    val isInvalid = !isValid // (false)

    var number = 1

    println("old number: $number")
    number++
    println("new number: $number")

    val user = user(
        password = 1234,
        username = "utsman"
    )
}

//fun plusAge(age: Int): Int {
//    return age + 1
//}

fun plusAge(age: Int): Int = age + 1

fun user(username: String, password: Int) {

}

//class User2()
//
//data class User(
//    var username: String?,
//    var password: String?
//)