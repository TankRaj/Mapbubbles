package com.tanka.accessories.mapbubbles.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.tanka.accessories.mapbubbles.models.Location;

/**
 * Created by access-tanka on 2/25/18.
 */

@Database(entities = {Location.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DB_NAME = "note_db";

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DB_NAME)
                            .allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public abstract LocationDao getLocDao();


}


