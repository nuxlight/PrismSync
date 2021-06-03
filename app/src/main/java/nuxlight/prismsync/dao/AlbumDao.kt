package nuxlight.prismsync.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import nuxlight.prismsync.models.AlbumEntity

@Dao
interface AlbumDao {

    @Query("SELECT * FROM album_table")
    fun getAll(): LiveData<List<AlbumEntity>>

    @Insert
    fun addAlbum(album: AlbumEntity)
}