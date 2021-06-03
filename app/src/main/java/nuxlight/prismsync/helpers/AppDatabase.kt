package nuxlight.prismsync.helpers

import androidx.room.Database
import androidx.room.RoomDatabase
import nuxlight.prismsync.dao.AlbumDao
import nuxlight.prismsync.models.AlbumEntity

@Database(entities = [AlbumEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun albumDao(): AlbumDao

    /*companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this) {
                return Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "primsdb"
                ).build()
            }
        }
    }*/
}