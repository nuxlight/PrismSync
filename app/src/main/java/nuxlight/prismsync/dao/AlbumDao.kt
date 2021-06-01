package nuxlight.prismsync.dao

import androidx.room.Dao
import androidx.room.Query

@Dao
interface AlbumDao {

    @Query("SELECT * FROM imageentity")
    fun getAll()
}