package main.utility

import net.sourceforge.tess4j.TesseractException
import java.File


class MysteriousText {


    fun getImgText(imageLocation: String): String {
        try {
            File(imageLocation)
        }

    }
}

}

fun getImgText(imageLocation: String): String {
    //val instance = Tesseract()
    try {
        return instance.doOCR(File(imageLocation))
    } catch (e: TesseractException) {
        e.getMessage()
        return "Error while reading image"
    }
