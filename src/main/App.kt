package main

import main.utility.TesseractWrapper

/**
 * lets (go) kotlin ...
 */
fun main(args : Array<String>) {

    val image = "images/20181111_010309_2.jpg"

    val twrapper = TesseractWrapper(image)
    twrapper.convertImage()
}