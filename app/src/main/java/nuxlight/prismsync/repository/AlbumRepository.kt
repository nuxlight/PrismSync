package nuxlight.prismsync.repository

import androidx.lifecycle.LiveData
import nuxlight.prismsync.dao.AlbumDao
import nuxlight.prismsync.models.AlbumEntity

class AlbumRepository(private val  albumDao: AlbumDao) {

    val readAllAlbum: LiveData<List<AlbumEntity>> = albumDao.getAll()

    fun addAlbum(album: AlbumEntity){
        albumDao.addAlbum(album)
    }
}