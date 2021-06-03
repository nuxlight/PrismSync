package nuxlight.prismsync.helpers

import androidx.room.Database
import androidx.room.RoomDatabase
import nuxlight.prismsync.dao.AlbumDao
import nuxlight.prismsync.models.AlbumEntity

@Database(entities = arrayOf(AlbumEntity::class), version = 1 )
abstract class AppDatabase : RoomDatabase() {
    abstract fun albumDao(): AlbumDao

    companion object{


    }
}