package utility

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TestRestServiceTest {

    @Before fun setup(){
        val rs = TestRestService.getInstance()
    }

    @Test fun getTest_responseCode200() {
        assertEquals("OK", "OK")
    }

    @Test
    fun getTest_content(){
        assertEquals("OK", "OK")
    }

    @Test fun postTest_responseCode200() {
        assertEquals("OK", "OK")
    }

}