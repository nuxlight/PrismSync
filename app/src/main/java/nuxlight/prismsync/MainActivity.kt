package nuxlight.prismsync

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.room.Room
import nuxlight.prismsync.helpers.AppDatabase
import nuxlight.prismsync.helpers.ImageHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageHelper: ImageHelper = ImageHelper()
        val imgBdd = imageHelper.getImageEntities(contentResolver)
        val folderList = imgBdd.distinctBy { it.album }
        val db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "Prism_data").build()
        Log.d(localClassName, "This is folders find in PHONE")
        folderList.forEach {
            Log.d(localClassName, it.album.name)
        }
        Log.d(localClassName, "This is folders in DATABASE")
        val albumDao = db.albumDao()
        albumDao.getAll().observe(this, Observer { itDb ->
            itDb.forEach { el ->
                val res = folderList.find { it.name == el.name }
                if (res!=null){
                    Log.i(localClassName, res.toString())
                }
                else {
                    Log.d(localClassName, "Add new folder in db")
                    albumDao.addAlbum(el)
                }
            }
        })
    }
}