



fun main(args: Array<String>) {
//    val age = 29
//    val yourAge: String = age.convertAge()
//    println(yourAge)
//
//    val nextYouAge = age.nextAge()
//    println(nextYouAge.convertAge())


//    val arrayMember = arrayOf("ucup", "parjo")
//    //println(arrayMember)
//    val member = arrayMember[1]
//    println(member)
//    arrayMember.forEach { member ->
//        println(member)
//    }

//    val arrayMember = Array(2) { index ->
//        "ini index ke -> $index"
//    }
//
//    arrayMember.forEach { name ->
//        println(name)
//    }

    // array
//    val arrayMember = arrayOf("ucup", "parjo")
//    println(arrayMember)
    // list
//    val listMember = listOf("ucup", "parjo", "parjo")
//    println(listMember)
    // set
//    val setMember = setOf("ucup", "parjo", "parjo")
//    println(setMember)
    val map = mapOf(1 to "ucup",10 to "parjo")
    println(map)
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

class BinarAnu(private val string: String) {

    private val anuinaja = ""



    fun binarTest(): BinarAnu {
        this.anuinaja
        return this
    }

    inner class BinarAnuin {
        fun anuin() {

        }
    }
}