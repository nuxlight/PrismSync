package nuxlight.prismsync.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import nuxlight.prismsync.models.Album
import nuxlight.prismsync.repository.AlbumRepository

class AlbumViewModel(private  val repository: AlbumRepository): ViewModel() {

    val allAlbum: LiveData<List<Album>> = repository.readAllAlbum.asLiveData()
}

class AlbumViewModelFactory(private val repository: AlbumRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        TODO("Not yet implemented")
    }

}