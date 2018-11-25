package main

import utility.TestRestService

/**
 * lets (go) kotlin ...
 */
fun main(args : Array<String>) {

    val image = "images/20181111_010309_2.jpg"

    val rs = TestRestService.getInstance()
    println(rs.getTest())
    println(rs.deleteTest())

}