package nuxlight.prismsync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nuxlight.prismsync.helpers.ImageHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageHelper: ImageHelper = ImageHelper()
        imageHelper.getImageEntities(contentResolver)
    }
}