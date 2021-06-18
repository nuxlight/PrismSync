package nuxlight.prismsync.repository

import kotlinx.coroutines.flow.Flow
import nuxlight.prismsync.dao.AlbumDao
import nuxlight.prismsync.models.Album

class AlbumRepository(private val  albumDao: AlbumDao) {

    val readAllAlbum: Flow<List<Album>> = albumDao.getAll()

    fun addAlbum(album: Album){
        albumDao.addAlbum(album)
    }
}