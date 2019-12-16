package com.chizhikalex.projectfortest

import com.chizhikalex.projectfortest.dummy.SimpleSpice
import com.chizhikalex.projectfortest.dummy.Spice
import kotlin.random.Random

var rollDice: Int = 0
    get() = field + x + y
    set(value) {
        field = 100
    }

var x = 100
var y = 200
val random
    get() = Random.nextInt()

fun nextInt() = Random.nextInt()

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}

fun List<Int>.divisibleBy(block: (Int)->Int): List<Int>  {
    val results = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            results.add(item)
        }
    }
    return results
}


fun main() {
//    val game = Game()
//    println(game.path)
//    game.north()
//    game.south()
//    game.east()
//    game.west()
//    game.end()
//    println(game.path)

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.divisibleBy {
        println(it)
        val xxxx: Int = it.rem(3)
        println(xxxx)
        xxxx
    })
    hashMapOf<Any, Any>()
}