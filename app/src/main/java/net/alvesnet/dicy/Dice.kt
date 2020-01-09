package net.alvesnet.dicy

import java.util.*

class Dice(val sides: Int = 3, val type : String = "N") {

    fun roll() : String{
        return "d$sides = " + when(sides){

            3 -> Random().nextInt(sides) -1

            else -> Random().nextInt(sides) +1

        }.toString()
    }
}