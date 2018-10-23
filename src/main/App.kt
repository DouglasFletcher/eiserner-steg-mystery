package main

import main.utility.MysteriousText

/**
 * lets (go) kotlin ...
 */
class Main {

    fun main(args : Array<String>) {

        val mystery = MysteriousText("./data/20181021_125852.jpg")
        mystery.getImgText()
        mystery.saveImgText()
        println("Hello, world!")
    }

}
