package nuxlight.prismsync.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "album_table")
data class AlbumEntity (
    val name: String,
    @ColumnInfo(name = "is_synced") val isSynced: Boolean
)