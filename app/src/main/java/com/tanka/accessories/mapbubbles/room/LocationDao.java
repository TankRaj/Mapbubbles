package com.tanka.accessories.mapbubbles.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.tanka.accessories.mapbubbles.models.Place;

import java.util.List;

/**
 * Created by access-tanka on 2/25/18.
 */

@Dao
public interface LocationDao {

    @Insert
    void insertAll(Place... locations);

    @Update
    void updateAll(Place... locations);

    @Query("SELECT * FROM Place")
    List<Place> getAllLocations();

    @Query("SELECT * FROM Place where name LIKE :keyword")
    List<Place> getLocation(String keyword);

    @Delete
    void deleteAll(Place... locations);

    @Update
    void editLocation(Place location);

//    @Query("UPDATE Place SET `title` = :txTitle, `body` = :txBody, `date` = :txDate, `type` = :txType   WHERE id = :tid")
//    void updateLocation(long tid, String txTitle, String txBody, String txDate, String txType);
}
