package main.utility

class ServiceDetails {

    private val TARGET_URL = "https://vision.googleapis.com/v1/images:annotate?"
    private val API_KEY = "key=YOUR_API_KEY"
    private val ACCEPT_HEADER = ""
    private val CONTENT_TYPE = ""

    fun url(): String {
        return TARGET_URL
    }

    fun apikey(): String {
        return API_KEY
    }

    fun acceptHeader(): String {
        return ACCEPT_HEADER
    }

    fun contentType(): String {
        return CONTENT_TYPE
    }

}