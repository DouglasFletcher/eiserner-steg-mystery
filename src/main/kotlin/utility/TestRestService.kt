package utility

import khttp.put
import khttp.delete
import khttp.get
import khttp.post
import khttp.responses.Response

class TestRestService private constructor(){

    /**
     * singleton creation
     */
    companion object {

        private val INSTANCE: TestRestService = TestRestService()

        @Synchronized
        fun getInstance(): TestRestService {
            return INSTANCE
        }
    }

    // base url
    val BASEURL = "http://httpbin.org"

    /**
     * put request
     * @return response
     */
    fun putTest(sendData: Map<String, String>): Response {
        return put(
                "http://httpbin.org/put"
                , data = sendData
        )
    }

    /**
     * post request
     * @return response
     */
    fun postTest(sendData: Map<String, String>): Response {
        return post(
                "$BASEURL/post"
                , data= sendData
        )
    }

    /**
     * get request
     * @return response
     */
    fun getTest(): Response {
        return get("$BASEURL/get")
    }

    /**
     * delete request
     * @return response
     */
    fun deleteTest(): Response {
        return delete("$BASEURL/delete")
    }

}