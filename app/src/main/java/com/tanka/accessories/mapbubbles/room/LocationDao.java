package com.tanka.accessories.mapbubbles.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.tanka.accessories.mapbubbles.models.Location;

import java.util.List;

/**
 * Created by access-tanka on 2/25/18.
 */

@Dao
public interface LocationDao {

    @Insert
    void insertAll(Location... locations);

    @Update
    void updateAll(Location... locations);

    @Query("SELECT * FROM location")
    List<Location> getAllLocations();

    @Query("SELECT * FROM location where name LIKE :keyword")
    List<Location> getLocation(String keyword);

    @Delete
    void deleteAll(Location... locations);

    @Update
    void editLocation(Location location);

//    @Query("UPDATE Location SET `title` = :txTitle, `body` = :txBody, `date` = :txDate, `type` = :txType   WHERE id = :tid")
//    void updateLocation(long tid, String txTitle, String txBody, String txDate, String txType);
}
