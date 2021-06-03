package nuxlight.prismsync.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import nuxlight.prismsync.models.AlbumEntity

@Dao
interface AlbumDao {

    /**
     * Get All album added in database
     */
    @Query("SELECT * FROM album_table")
    fun getAll(): LiveData<List<AlbumEntity>>
}