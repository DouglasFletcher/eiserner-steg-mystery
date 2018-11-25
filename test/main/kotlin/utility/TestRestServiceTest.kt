package utility

import org.junit.Assert.assertEquals
import org.junit.Test

import kotlin.test.assertEquals

class TestRestServiceTest {

    var lateinit rs: TestRestService

    @Before fun setup(){
        rs = TestRestService.getInstance()
    }

    @Nested
    inner class GetRequests{

        @Test fun getTest_responseCode200() {
            assertEquals("OK", "OK")
        }

        @Test fun getTest_content(){
            assertEquals("OK", "OK")
        }

    }

    @Nested
    inner class PostRequests{

        @Test fun postTest_responseCode200() {
            assertEquals("OK", "OK")
        }

    }

}