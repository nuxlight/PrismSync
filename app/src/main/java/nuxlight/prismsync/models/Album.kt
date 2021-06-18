package nuxlight.prismsync.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "album_table")
data class Album (
    @PrimaryKey val name: String,
    @ColumnInfo(name = "is_synced") val isSynced: Boolean
)