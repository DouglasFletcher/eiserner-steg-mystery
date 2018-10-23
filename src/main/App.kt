package main

import main.utility.MysteriousText

/**
 * lets (go) kotlin ...
 */
fun main(args : Array<String>) {

    val mystery = MysteriousText("images/20181024_010309.jpg")
    mystery.getImgText()
    mystery.saveImgText()
}

