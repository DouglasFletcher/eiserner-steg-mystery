package main

import main.utility.MysteriousText

/**
 * lets go...
 */
class Main {

    fun main(args: Array<String>) {
        val mtext = MysteriousText("./data/20181021_125852.jpg")
        println(mtext.getImgText())
        //System.out.println(app.getImgText("C:\\Users\\User\\Pictures\\img.png"))
    }

}
