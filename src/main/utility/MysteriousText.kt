package main.utility

import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.TesseractException
import java.io.File

class MysteriousText {

    private var imageLocation: String

    constructor(imageLocation: String) {
        this.imageLocation = imageLocation
    }

    public fun getImgText(): String {
        val instance = Tesseract()
        try {
            return instance.doOCR(File(this.imageLocation))
        } catch (e: TesseractException) {
            e.message
            return "error parsing image"
        }
    }

}