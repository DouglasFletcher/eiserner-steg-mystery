package main.utility

import com.google.cloud.vision.v1.AnnotateImageRequest
import com.google.cloud.vision.v1.Feature
import com.google.cloud.vision.v1.Image
import com.google.cloud.vision.v1.ImageAnnotatorClient
import com.google.cloud.vision.v1.Feature.Type;
import com.google.protobuf.ByteString
import java.io.FileInputStream
import java.util.ArrayList
import java.io.IOException
import java.io.PrintStream


class GoogleVisionWrapper(val filePath: String) {

    @Throws(Exception::class, IOException::class)
    fun detectText() {
        // file reader
        val imgBytes = ByteString.readFrom(FileInputStream(filePath))
        val img = Image.newBuilder().setContent(imgBytes).build()
        // specify type
        val feat = Feature.newBuilder().setType(Type.TEXT_DETECTION).build()
        // request holder
        val requests = ArrayList<AnnotateImageRequest>()
        val request = AnnotateImageRequest//
                .newBuilder()//
                .addFeatures(feat)//
                .setImage(img).build()//
        requests.add(request)
        // response
        val response = ImageAnnotatorClient.create().batchAnnotateImages(requests)
        val responses = response.getResponsesList()
        // save value
        for (res in responses) {
            if (res.hasError()) {
                println("Error: %s\n" + res.getError().getMessage())
                return
            }
            for (annotation in res.getTextAnnotationsList()) {
                println("Text: %s\n" + annotation.getDescription())
                println("Position : %s\n" + annotation.getBoundingPoly())
            }
        }
    }

}
