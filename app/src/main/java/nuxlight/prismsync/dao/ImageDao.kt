package nuxlight.prismsync.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import nuxlight.prismsync.models.ImageEntity

@Dao
interface ImageDao {

    @Insert
    fun insertImage(vararg img: ImageEntity)

    @Delete
    fun deleteImage(img: ImageEntity)
}