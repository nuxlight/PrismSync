package nuxlight.prismsync.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import nuxlight.prismsync.models.Album

@Dao
interface AlbumDao {

    @Query("SELECT * FROM album_table")
    fun getAll(): Flow<List<Album>>

    @Insert
    fun addAlbum(album: Album)
}