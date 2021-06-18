package nuxlight.prismsync.models

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "image_table")
data class Image(
    @PrimaryKey val name: String,
    val album: Album,
    val uri: Uri
)