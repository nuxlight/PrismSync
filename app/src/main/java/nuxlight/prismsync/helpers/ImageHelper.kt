package nuxlight.prismsync.helpers

import android.content.ContentResolver
import android.content.ContentUris
import android.database.Cursor
import android.provider.MediaStore
import android.util.Log
import nuxlight.prismsync.models.AlbumEntity
import nuxlight.prismsync.models.ImageEntity

class ImageHelper {

    fun getImageEntities(contentResolver: ContentResolver) : MutableList<ImageEntity> {
        val listOfImageEntity : MutableList<ImageEntity> = mutableListOf()
        val projection = arrayOf(MediaStore.Images.Media._ID)
        val extUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        val intUri = MediaStore.Images.Media.INTERNAL_CONTENT_URI
        contentResolver.query(extUri, null, null, null, null)?.use {
            while (it.moveToNext()){
                val folder = it.getString(it.getColumnIndex(MediaStore.Images.Media.BUCKET_DISPLAY_NAME))
                val id : Long = it.getLong(it.getColumnIndex(MediaStore.Images.Media._ID))
                val imageName = it.getString(it.getColumnIndex(MediaStore.Images.Media.DISPLAY_NAME))
                val url = it.getString(it.getColumnIndex(MediaStore.Images.Media.RELATIVE_PATH))
                val contUri = ContentUris.withAppendedId(extUri, id)
                listOfImageEntity.add(ImageEntity(imageName, AlbumEntity(folder, false), contUri))
                Log.i(javaClass.name, "Ext new folder $folder with $contUri")
            }
        }
        contentResolver.query(intUri, projection, null, null, null)?.use {
            while (it.moveToNext()){
                Log.i(javaClass.name, "Int new folder $it")
            }
        }
        return listOfImageEntity
    }
}