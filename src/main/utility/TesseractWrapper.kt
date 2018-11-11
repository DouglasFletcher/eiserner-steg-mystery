package main.utility

import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.TesseractException
import java.io.File

class TesseractWrapper(val fileLocation: String) {

    fun convertImage(){
        val image = File(fileLocation)
        val tact = Tesseract()
        tact.setLanguage("KOR")
        try{
            val result = tact.doOCR(image)
            println(result)
        } catch (e: TesseractException){
            println(e.message)
        }
    }

}