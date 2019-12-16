package com.chizhikalex.projectfortest.dummy

class SimpleSpice {
    var name: String = "curry"
    var levelOfSpiciness: String = "mild"
    val heat: Int
        get() = when (levelOfSpiciness) {
            "mild" -> 5
            else -> 0
        }

}