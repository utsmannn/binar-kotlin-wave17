



fun main(args: Array<String>) {
    val age = 29
    val yourAge: String = age.convertAge()
    println(yourAge)

    val nextYouAge = age.nextAge()
    println(nextYouAge.convertAge())
}

//fun convertAge(age: Int): String {
//    return "$age tahun"
//}

fun Int.convertAge(): String {
    return "$this tahun"
}

fun Int.nextAge(): Int {
    return this+1
}

class BinarAnu {

    class BinarAnuin {
        fun anuin() {

        }
    }

    private val anuinaja = ""

    fun binarTest(): BinarAnu {
        this.anuinaja
        return this
    }
}