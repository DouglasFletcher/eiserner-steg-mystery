package main.utility

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.Response

class GoogleVisionApi(content: String){

    val content = content

    /**
     * google static params
     */
    companion object {
        const val TARGET_URL = "https://vision.googleapis.com/v1/images:annotate?";
        val API_KEY = "key=YOUR_API_KEY"
        val ACCEPT_HEADER = ""
        val CONTENT_TYPE = ""
    }


    /**
     * post request to google api
     */
    fun postRequest(): Response {
        return Fuel.post(TARGET_URL)
            .body(content).response().second
    }

}

