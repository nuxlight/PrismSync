package nuxlight.prismsync

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import nuxlight.prismsync.helpers.AppDatabase
import nuxlight.prismsync.helpers.ImageHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageHelper = ImageHelper()
        val imgBdd = imageHelper.getImageEntities(contentResolver)
        val folderList = imgBdd.distinctBy { it.album }
        val db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "Prism_data").build()
        Log.d(localClassName, "This is folders find in PHONE")
        folderList.forEach {
            Log.d(localClassName, it.album.name)
        }
        Log.d(localClassName, "This is folders in DATABASE")
        val albumDao = db.albumDao()
    }
}