package com.binar.aja

fun main(args: Array<String>) {
    /*var binar: Binar? = null
    //binar = Binar()
    val year = binar?.year
    println(year)
    binar = Binar()
    println(binar.year)*/

//    val listMember: List<String>? = null
//
//    val getIndex3 = listMember?.get(3)
//    println(getIndex3)
//
//    val getIndex32 = if (listMember != null) {
//        println("?")
//        listMember.get(3)
//    } else {
//        null
//    }
//    println(getIndex32)
    /*println(listMember)

    val listMember2: List<String>? = emptyList()
    println(listMember2)*/


    val binar = Binar()
    //binar.looping()
    //binar.enumControl(Type.UNCHECK)
    binar.sealedControl(TypeSeal.Three("ini dong"))

}

class Binar {
    val year: Int = 2023

    fun check() {
        when (year) {
            1 -> println("tahun 1")
            2021 -> println("tahun kemarin")
            in 2000..2020 -> {
                println("tahun kemarin nya lagi")
            }
            2022 -> println("tahun ini")
            else -> println("tahun kapan ini")
        }
    }

    fun looping() {
        val listMember = listOf(
            "kucing",
            "onta",
            "kura-kura",
            "gajah",
            "burung",
            "macan",
            "singa"
        )

//        listMember.forEach { binatang ->
//            Thread.sleep(2000)
//            println(binatang)
//        }

//        for (binatang in listMember) {
//            Thread.sleep(500)
//            println(binatang)
//        }

//        listMember.forEachIndexed { index, binatang ->
//            println("$binatang - $index")
//        }

        //var size = 0

        /*while (size <= 6 && size > 0) {
            println("size is -> $size")
            size++
        }*/

        /*do {
            println("size is -> $size")
            size++
        } while (size <= 6 && size > 0)*/
    }

    fun enumControl(type: Type) {
        when (type) {
            Type.CHECK -> println("ini check")
            Type.UNCHECK -> println("ini gak uncheck")
        }
    }

    fun sealedControl(typeSeal: TypeSeal) {
        when (typeSeal) {
            is TypeSeal.One -> println("ini one")
            is TypeSeal.Two -> {
                println("ini two")
            }
            is TypeSeal.Three -> {
                println("ini tree -> ${typeSeal.anuan}")
            }
        }
    }
}

enum class Type {
    CHECK, UNCHECK
}

sealed class TypeSeal {
    object One : TypeSeal()
    object Two : TypeSeal()
    data class Three(val anuan: String = "") : TypeSeal()
}