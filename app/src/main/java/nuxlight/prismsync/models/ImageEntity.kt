package nuxlight.prismsync.models

import android.net.Uri
import androidx.room.Entity

@Entity(tableName = "image_table")
data class ImageEntity(
    val name: String,
    val album: AlbumEntity,
    val uri: Uri
)