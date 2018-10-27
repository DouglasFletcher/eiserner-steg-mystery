package main

import main.utility.GoogleVisionApi

/**
 * lets (go) kotlin ...
 */
fun main(args : Array<String>) {

    // post request
    val gvApi = GoogleVisionApi
    val response = gvApi.postRequest()
    println(response)

}

