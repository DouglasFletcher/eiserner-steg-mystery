package main.utility

import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.TesseractException
import java.io.File

class MysteriousText(val imageLocation: String) {

    private lateinit var imageScanned: String
    private val FILEOUT: String = "images/out_text.txt";
    private val TESS4JFOLDERPATH = "tessdata/"

    /**
     * using sourceforge to extract text from image
     */
    public fun getImgText(){
        val instance = Tesseract()
        instance.setDatapath(TESS4JFOLDERPATH);
        instance.setLanguage("jpn");
        try {
            println("extracting letters from image..")
            imageScanned = instance.doOCR(File(imageLocation))
        } catch (e: TesseractException) {
            e.message
            println("failed parsing image")
            println(e.message)
            imageScanned = "error parsing image"
        }
    }

    /**
     * save text to file
     */
    public fun saveImgText(){
        File(FILEOUT).printWriter().use { out ->
            this.imageScanned.forEach {
                out.println("${it.toString()}")
            }
        }
    }

}