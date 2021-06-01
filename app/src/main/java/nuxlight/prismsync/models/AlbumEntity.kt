package nuxlight.prismsync.models

import androidx.room.Entity

@Entity
data class AlbumEntity (
    val name: String,
    val isSynced: Boolean
)