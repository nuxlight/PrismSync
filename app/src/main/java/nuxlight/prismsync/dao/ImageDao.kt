package nuxlight.prismsync.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import nuxlight.prismsync.models.Image

@Dao
interface ImageDao {

    @Insert
    fun insertImage(vararg img: Image)

    @Delete
    fun deleteImage(img: Image)
}