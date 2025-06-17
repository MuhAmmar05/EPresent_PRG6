package com.example.epresent_prg6.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.epresent_prg6.model.MHariLibur;
import com.example.epresent_prg6.model.VAbsensi;

import java.util.List;
import java.util.UUID;

@Dao
public interface MHariLiburDao {
    @Query("SELECT * FROM mharilibur")
    public LiveData<List<MHariLibur>> getHolidays();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(MHariLibur mHariLibur);

    @Query("DELETE FROM mharilibur")
    void deleteAll();
}
