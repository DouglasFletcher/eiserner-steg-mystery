package main

import net.sourceforge.tess4j.*
import java.io.*

/**
 * lets go...
 */
class Main {

    /**
     * <h3>get the mysterious text</h3>
     * <p>
     *
     * </p>
     */
    fun getImgText(imageLocation: String): String {
        val instance = Tesseract()
        try {
            return instance.doOCR(File(imageLocation))
        } catch (e: TesseractException) {
            e.getMessage()
            return "Error while reading image"
        }

    }

}
