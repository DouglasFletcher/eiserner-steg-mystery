package main.utility

import com.google.api.Http
import org.apache.http.HttpRequest
import org.apache.http.client.HttpClient
import java.io.BufferedInputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URI
import java.net.URL
import java.net.URLConnection

class GoogleVisionApi(serviceDetails: ServiceDetails) {

    var serverUrl: URL

    init {
        serverUrl = URL(serviceDetails.url() + serviceDetails.apikey())
    }

    fun postRequest() {
        val httpConnection = serverUrl.openConnection() as HttpURLConnection
        httpConnection.requestMethod = "POST"
        httpConnection.setRequestProperty("Content-Type", "application/json")
        try {
        } finally {
            httpConnection.disconnect()
        }
    }

}

