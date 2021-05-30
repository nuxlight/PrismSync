package nuxlight.prismsync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import nuxlight.prismsync.helpers.ImageHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageHelper: ImageHelper = ImageHelper()
        val imgBdd = imageHelper.getImageEntities(contentResolver)
        val folderList = imgBdd.distinctBy { it.album }
        folderList.forEach {
            Log.i(localClassName, it.album)
        }
    }
}