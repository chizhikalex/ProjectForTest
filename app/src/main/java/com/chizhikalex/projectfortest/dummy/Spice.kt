package com.chizhikalex.projectfortest.dummy

class Spice(val name:String, var spiciness: String = "mild") {
    val heat: Int
        get() = when(spiciness) {
                "mild" -> 5
                else -> 0
            }
    constructor(x:Int): this(""){

    }
}